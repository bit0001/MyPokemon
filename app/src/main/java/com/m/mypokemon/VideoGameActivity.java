package com.m.mypokemon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class VideoGameActivity extends AppCompatActivity {

    public static final String GENERATION = "pokemonGeneration";
    private String version;
    private TextView nameTextView;
    private ImageView coverImageView;
    private Spinner spinner;
    private TextView platformTextView;
    private TextView developerTextView;
    private TextView publisherTextView;
    private TextView releaseTextView;
    private VideoGame videoGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_game);
        Intent intent = getIntent();
        PKMGeneration pkmGeneration = (PKMGeneration) intent.getSerializableExtra(GENERATION);
        int pkmVideoGameOption = intent.getIntExtra(SubSubMenuActivity.OPTION, -1);

        nameTextView = (TextView) findViewById(R.id.video_game_name);
        coverImageView = (ImageView) findViewById(R.id.video_game_cover);
        spinner = (Spinner) findViewById(R.id.video_game_version);
        platformTextView = (TextView) findViewById(R.id.video_game_platform);
        developerTextView = (TextView) findViewById(R.id.video_game_developer);
        publisherTextView = (TextView) findViewById(R.id.video_game_publisher);
        releaseTextView = (TextView) findViewById(R.id.video_game_release);

        switch (pkmGeneration) {
            case FIRST:
                switch (pkmVideoGameOption) {
                    case 0:
                        videoGame = VideoGame.RED_AND_BLUE;
                        populateView(videoGame);
                        break;
                    case 1:
                        videoGame = VideoGame.YELLOW;
                        populateView(videoGame);
                        break;
                }
                break;
        }

        final VideoGame finalPkmVideoGame = videoGame;
        assert spinner != null;
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                version = spinner.getSelectedItem().toString();
                nameTextView.setText("Pokémon " + version);
                coverImageView.setImageResource(finalPkmVideoGame.getCoverIds().get(version));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void populateView(VideoGame videoGame) {
        String[] videoGameVersions = videoGame.getCoverIds().keySet().toArray(new String[videoGame.getCoverIds().size()]);
        if (videoGameVersions.length > 1) {
            spinner.setVisibility(View.VISIBLE);
        } else {
            spinner.setVisibility(View.GONE);
        }
        version = videoGameVersions[0];
        nameTextView.setText("Pokémon " + version);
        coverImageView.setImageResource(videoGame.getCoverIds().get(videoGameVersions[0]));
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, videoGameVersions);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);
        platformTextView.setText(videoGame.getPlatform());
        developerTextView.setText(videoGame.getDeveloper());
        publisherTextView.setText(videoGame.getPublisher());
        releaseTextView.setText(videoGame.getReleaseDate());
    }

    public void clickMethod(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoGame.getUrls().get(version)));
        startActivity(browserIntent);
    }
}

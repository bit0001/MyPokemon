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
        PKMGeneration generation = (PKMGeneration) intent.getSerializableExtra(GENERATION);
        FirstGenerationVideoGame selectedVideoGame =
                FirstGenerationVideoGame.values()[intent.getIntExtra(SubSubMenuActivity.OPTION, -1)];

        getViewsOfActivity();

        switch (generation) {
            case FIRST:
                switch (selectedVideoGame) {
                    case RED_AND_BLUE:
                        videoGame = VideoGame.RED_AND_BLUE;
                        populateView(videoGame);
                        break;
                    case YELLOW:
                        videoGame = VideoGame.YELLOW;
                        populateView(videoGame);
                        break;
                }
                break;
        }

        final VideoGame finalVideoGame = videoGame;
        assert spinner != null;
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                version = spinner.getSelectedItem().toString();
                populateVideoGameNameAndCover(finalVideoGame);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void getViewsOfActivity() {
        nameTextView = (TextView) findViewById(R.id.video_game_name);
        coverImageView = (ImageView) findViewById(R.id.video_game_cover);
        spinner = (Spinner) findViewById(R.id.video_game_version);
        platformTextView = (TextView) findViewById(R.id.video_game_platform);
        developerTextView = (TextView) findViewById(R.id.video_game_developer);
        publisherTextView = (TextView) findViewById(R.id.video_game_publisher);
        releaseTextView = (TextView) findViewById(R.id.video_game_release);
    }

    private void populateView(VideoGame videoGame) {
        String[] versions = videoGame.getCoverIds().keySet().toArray(new String[videoGame.getCoverIds().size()]);
        version = versions[0];
        populateVideoGameNameAndCover(videoGame);

        if (versions.length > 1) {
            ArrayAdapter<String> arrayAdapter =
                    new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, versions);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
            spinner.setVisibility(View.VISIBLE);
        } else {
            spinner.setVisibility(View.GONE);
        }

        platformTextView.setText(videoGame.getPlatform());
        developerTextView.setText(videoGame.getDeveloper());
        publisherTextView.setText(videoGame.getPublisher());
        releaseTextView.setText(videoGame.getReleaseDate());
    }

    private void populateVideoGameNameAndCover(VideoGame videoGame) {
        nameTextView.setText(new StringBuilder("Pokémon ").append(version));
        coverImageView.setImageResource(videoGame.getCoverIds().get(version));
    }

    public void clickMethod(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoGame.getUrls().get(version)));
        startActivity(browserIntent);
    }

}

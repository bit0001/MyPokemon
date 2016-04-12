package com.m.mypokemon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VideoGameActivity extends AppCompatActivity {

    public static final String GENERATION = "pokemonGeneration";
    private String pokemonVersion;
    private TextView videoGameName;
    private ImageView videoGameCover;
    private Spinner videoGameSpinner;
    private TextView platform;
    private TextView developer;
    private TextView publisher;
    private TextView release;
    private VideoGame pkmVideoGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_game);
        Intent intent = getIntent();
        PKMGeneration pkmGeneration = (PKMGeneration) intent.getSerializableExtra(GENERATION);
        int pkmVideoGameOption = intent.getIntExtra(SubSubMenuActivity.OPTION, -1);

        videoGameName = (TextView) findViewById(R.id.video_game_name);
        videoGameCover = (ImageView) findViewById(R.id.video_game_cover);
        videoGameSpinner = (Spinner) findViewById(R.id.video_game_version);
        platform = (TextView) findViewById(R.id.video_game_platform);
        developer = (TextView) findViewById(R.id.video_game_developer);
        publisher = (TextView) findViewById(R.id.video_game_publisher);
        release = (TextView) findViewById(R.id.video_game_release);

        switch (pkmGeneration) {
            case FIRST:
                switch (pkmVideoGameOption) {
                    case 0:
                        pkmVideoGame = VideoGame.RED_AND_BLUE;
                        populateView(pkmVideoGame);
                        break;
                    case 1:
                        pkmVideoGame = VideoGame.YELLOW;
                        populateView(pkmVideoGame);
                        break;
                }
                break;
        }

        final VideoGame finalPkmVideoGame = pkmVideoGame;
        assert videoGameSpinner != null;
        videoGameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pokemonVersion = videoGameSpinner.getSelectedItem().toString();
                videoGameName.setText("Pokémon " + pokemonVersion);
                videoGameCover.setImageResource(finalPkmVideoGame.getCoverIds().get(pokemonVersion));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void populateView(VideoGame videoGame) {
        String[] videoGameVersions = videoGame.getCoverIds().keySet().toArray(new String[videoGame.getCoverIds().size()]);
        if (videoGameVersions.length > 1) {
            videoGameSpinner.setVisibility(View.VISIBLE);
        } else {
            videoGameSpinner.setVisibility(View.GONE);
        }
        pokemonVersion = videoGameVersions[0];
        videoGameName.setText("Pokémon " + pokemonVersion);
        videoGameCover.setImageResource(videoGame.getCoverIds().get(videoGameVersions[0]));
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, videoGameVersions);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        videoGameSpinner.setAdapter(spinnerArrayAdapter);
        platform.setText(videoGame.getPlatform());
        developer.setText(videoGame.getDeveloper());
        publisher.setText(videoGame.getPublisher());
        release.setText(videoGame.getReleaseDate());
    }

    public void clickMethod(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(pkmVideoGame.getUrls().get(pokemonVersion)));
        startActivity(browserIntent);
    }
}

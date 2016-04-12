package com.m.mypokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class VideoGameActivity extends AppCompatActivity {

    public static final String GENERATION = "pokemonGeneration";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_game);
        Intent intent = getIntent();
        PKMGeneration pkmGeneration = (PKMGeneration) intent.getSerializableExtra(GENERATION);
        int pkmVideoGame = intent.getIntExtra(SubSubMenuActivity.OPTION, -1);

        TextView videoGameName = (TextView) findViewById(R.id.video_game_name);
        ImageView videoGameCover = (ImageView) findViewById(R.id.video_game_cover);
        Spinner videoGameSpinner = (Spinner) findViewById(R.id.video_game_version);
        TextView platform = (TextView) findViewById(R.id.video_game_platform);
        TextView developer = (TextView) findViewById(R.id.video_game_developer);
        TextView publisher = (TextView) findViewById(R.id.video_game_publisher);
        TextView release = (TextView) findViewById(R.id.video_game_release);


        switch (pkmGeneration) {
            case FIRST:
                switch (pkmVideoGame) {
                    case 0:
                        VideoGame redAndBlue = VideoGame.RED_AND_BLUE;
                        String[] videoGameVersions = (String[]) redAndBlue.getCoverIds().keySet().toArray(new String[redAndBlue.getCoverIds().size()]);
                        videoGameName.setText("Pokémon " + videoGameVersions[0]);
                        videoGameCover.setImageResource(redAndBlue.getCoverIds().get(videoGameVersions[0]));
                        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, videoGameVersions);
                        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        videoGameSpinner.setAdapter(spinnerArrayAdapter);
                        platform.setText(redAndBlue.getPlatform());
                        developer.setText(redAndBlue.getDeveloper());
                        publisher.setText(redAndBlue.getPublisher());
                        release.setText(redAndBlue.getReleaseDate());
                        break;
                }
                break;
        }

    }

}

package com.m.mypokemon;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_game);
        Intent intent = getIntent();
        PKMGeneration pkmGeneration = (PKMGeneration) intent.getSerializableExtra(GENERATION);
        int pkmVideoGameOption = intent.getIntExtra(SubSubMenuActivity.OPTION, -1);
        VideoGame pkmVideoGame = null;

        final TextView videoGameName = (TextView) findViewById(R.id.video_game_name);
        final ImageView videoGameCover = (ImageView) findViewById(R.id.video_game_cover);
        final Spinner videoGameSpinner = (Spinner) findViewById(R.id.video_game_version);
        TextView platform = (TextView) findViewById(R.id.video_game_platform);
        TextView developer = (TextView) findViewById(R.id.video_game_developer);
        TextView publisher = (TextView) findViewById(R.id.video_game_publisher);
        TextView release = (TextView) findViewById(R.id.video_game_release);


        switch (pkmGeneration) {
            case FIRST:
                switch (pkmVideoGameOption) {
                    case 0:
                        pkmVideoGame = VideoGame.RED_AND_BLUE;
                        String[] videoGameVersions = (String[]) pkmVideoGame.getCoverIds().keySet().toArray(new String[pkmVideoGame.getCoverIds().size()]);
                        videoGameName.setText("Pokémon " + videoGameVersions[0]);
                        videoGameCover.setImageResource(pkmVideoGame.getCoverIds().get(videoGameVersions[0]));
                        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, videoGameVersions);
                        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        videoGameSpinner.setAdapter(spinnerArrayAdapter);
                        platform.setText(pkmVideoGame.getPlatform());
                        developer.setText(pkmVideoGame.getDeveloper());
                        publisher.setText(pkmVideoGame.getPublisher());
                        release.setText(pkmVideoGame.getReleaseDate());
                        break;
                }
                break;
        }

        final VideoGame finalPkmVideoGame = pkmVideoGame;
        videoGameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String pokemonVersion = videoGameSpinner.getSelectedItem().toString();
                videoGameName.setText("Pokémon " + pokemonVersion);
                videoGameCover.setImageResource(finalPkmVideoGame.getCoverIds().get(pokemonVersion));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}

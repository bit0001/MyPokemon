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

import com.m.mypokemon.ui.activities.SubSubMenuActivity;

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
        int position = intent.getIntExtra(SubSubMenuActivity.OPTION, -1);
        videoGame = getVideoGame(generation, position);

        getViewsOfActivity();
        populateView(videoGame);

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

    private VideoGame getVideoGame(PKMGeneration generation, int position) {
        switch (generation) {
            case FIRST:
                FirstGenerationVideoGame firstGenerationVideoGame =
                        FirstGenerationVideoGame.values()[position];
                switch (firstGenerationVideoGame) {
                    case RED_AND_BLUE:
                        return VideoGame.RED_AND_BLUE;
                    case YELLOW:
                        return VideoGame.YELLOW;
                }
            case SECOND:
                SecondGenerationVideoGame secondGenerationGame =
                        SecondGenerationVideoGame.values()[position];
                switch (secondGenerationGame) {
                    case GOLD_AND_SILVER:
                        return VideoGame.GOLD_AND_SILVER;
                    case CRYSTAL:
                        return VideoGame.CRYSTAL;
                }
            case THIRD:
                ThirdGenerationVideoGame thirdGenerationVideoGame =
                        ThirdGenerationVideoGame.values()[position];
                switch (thirdGenerationVideoGame) {
                    case RUBY_AND_SAPPHIRE:
                        return VideoGame.RUBY_AND_SAPPHIRE;
                    case FIRERED_AND_LEAFGREEN:
                        return VideoGame.FIRERED_AND_LEAFGREEN;
                    case EMERALD:
                        return VideoGame.EMERALD;
                }
            case FORTH:
                FourthGenerationVideoGame fourthGenerationVideoGame =
                        FourthGenerationVideoGame.values()[position];
                switch (fourthGenerationVideoGame) {
                    case DIAMOND_AND_PEARL:
                        return VideoGame.DIAMOND_AND_PEARL;
                    case PLATINUM:
                        return VideoGame.PLATINUM;
                    case HEARTGOLD_AND_SOULSILVER:
                        return VideoGame.HEARTGOLD_AND_SOULSILVER;
                }
            case FIFTH:
                FifthGenerationVideoGame fifthGenerationVideoGame =
                        FifthGenerationVideoGame.values()[position];
                switch (fifthGenerationVideoGame) {
                    case BLACK_AND_WHITE:
                        return VideoGame.BLACK_AND_WHITE;
                    case BLACK2_AND_WHITE2:
                        return VideoGame.BLACK2_AND_WHITE2;
                }
            case SIXTH:
                SixthGenerationVideoGame sixthGenerationVideoGame =
                        SixthGenerationVideoGame.values()[position];
                switch (sixthGenerationVideoGame) {
                    case X_AND_Y:
                        return VideoGame.X_AND_Y;
                    case OMEGA_RUBY_AND_ALPHA_SAPPHIRE:
                        return VideoGame.OMEGA_RUBY_AND_ALPHA_SAPPHIRE;
                }
            case SEVENTH:
                SeventhGenerationVideoGame seventhGenerationVideoGame =
                        SeventhGenerationVideoGame.values()[position];
                switch (seventhGenerationVideoGame) {
                    case SUN_AND_MOON:
                        return VideoGame.SUN_AND_MOON;
                }
        }
        return null;
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

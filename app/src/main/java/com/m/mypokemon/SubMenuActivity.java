package com.m.mypokemon;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubMenuActivity extends ListActivity {

    public static final String SUB_MENU_OPTION = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView pokemonListView = getListView();
        Intent intent = getIntent();
        int subMenuOption = intent.getIntExtra(SUB_MENU_OPTION, -1);
        Integer stringArrayId = null;

        switch (MainMenuOption.values()[subMenuOption]){
            case POKEMON:
                stringArrayId = R.array.pokemon_classification;
                break;
            case POKEMON_TYPES:
                stringArrayId = R.array.pokemon_types;
                break;
            case POKE_BALLS:
                stringArrayId = R.array.poke_ball_types;
                break;
            case REGIONS:
                stringArrayId = R.array.regions;
                break;
            case BADGES:
                stringArrayId = R.array.leagues;
                break;
            case VIDEO_GAMES:
                stringArrayId = R.array.video_games;
                break;
        }

        ArrayAdapter<CharSequence> pokemonClassificationStringArray = ArrayAdapter.
                createFromResource(this, stringArrayId,
                        android.R.layout.simple_list_item_1);
        pokemonListView.setAdapter(pokemonClassificationStringArray);
    }

}

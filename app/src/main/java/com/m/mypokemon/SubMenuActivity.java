package com.m.mypokemon;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubMenuActivity extends ListActivity {

    public static MainMenuOption mainMenuOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView subMenuOptions = getListView();
        Intent intent = getIntent();
        mainMenuOption = (MainMenuOption) intent.getSerializableExtra(MainMenuActivity.MAIN_MENU_OPTION);
        Integer stringArrayId = null;

        switch (mainMenuOption){
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

        ArrayAdapter<CharSequence> subMenuOptionsArrayAdapter = ArrayAdapter.
                createFromResource(this, stringArrayId,
                        android.R.layout.simple_list_item_1);
        subMenuOptions.setAdapter(subMenuOptionsArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, SubSubMenuActivity.class);
        intent.putExtra(MainMenuActivity.MAIN_MENU_OPTION, mainMenuOption);

        switch (mainMenuOption) {
            case POKEMON:
                PokemonClassification pokemonClassification =
                        PokemonClassification.values()[position];
                switch (pokemonClassification) {
                    case STARTER:
                    case LEGENDARY:
                        intent.putExtra(SubSubMenuActivity.SUB_MENU_OPTION, pokemonClassification);
                        startActivity(intent);
                        break;
                }
                break;
        }
    }
}

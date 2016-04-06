package com.m.mypokemon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonActivity extends AppCompatActivity {
    public static String POKEMON_LIST = "pokemonListId";
    public static String POKEMON_ID = "pokemonId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        int pokemonListId = (Integer) getIntent().getExtras().get(POKEMON_LIST);
        int pokemonId = (Integer) getIntent().getExtras().get(POKEMON_ID);

        Pokemon pokemon = null;

        switch (pokemonListId) {
            case 0:
                pokemon = Pokemon.STARTERS[pokemonId];
                break;
            case 1:
                pokemon = Pokemon.LEGENDARY_BIRDS[pokemonId];
                break;
            case 2:
                pokemon = Pokemon.LEGENDARY_BEASTS[pokemonId];
                break;
        }

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(pokemon.getName());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(pokemon.getPhotoId());

        TextView information = (TextView) findViewById(R.id.information);
        information.setText(pokemon.getInformationId());
    }

}

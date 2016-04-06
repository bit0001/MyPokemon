package com.m.mypokemon;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PokemonListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView pokemonListView = getListView();
        Intent intent = getIntent();
        Pokemon[] pokemons;

        switch (intent.getIntExtra("position", -1)) {
            case 0:
                pokemons = Pokemon.STARTERS;
                break;
            case 1:
                pokemons = Pokemon.LEGENDARY_BIRDS;
                break;
            case 2:
                pokemons = Pokemon.LEGENDARY_BEASTS;
                break;
            default:
                pokemons = new Pokemon[0];
        }

        ArrayAdapter<Pokemon> pokemonListAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                pokemons
        );

        pokemonListView.setAdapter(pokemonListAdapter);
    }
}

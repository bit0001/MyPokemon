package com.m.mypokemon;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PokemonClassificationActivity extends ListActivity {

    private static int pokemonListId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView pokemonListView = getListView();
        Intent intent = getIntent();
        Pokemon[] pokemons;
        pokemonListId = intent.getIntExtra("position", -1);

        switch (pokemonListId) {
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

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, PokemonActivity.class);
        intent.putExtra(PokemonActivity.POKEMON_LIST, pokemonListId);
        intent.putExtra(PokemonActivity.POKEMON_ID, (int) id);
        startActivity(intent);
    }
}

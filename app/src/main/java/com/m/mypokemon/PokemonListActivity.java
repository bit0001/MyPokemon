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
        ListView pokemonList = getListView();
        Intent intent = getIntent();

        ArrayAdapter<String> pokemonListAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Pokemon.POKEMON_LISTS[intent.getIntExtra("position", 0)]
        );

        pokemonList.setAdapter(pokemonListAdapter);
    }
}

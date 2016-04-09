package com.m.mypokemon;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubMenuActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView pokemonListView = getListView();
        ArrayAdapter<CharSequence> pokemonClassificationStringArray =
                ArrayAdapter.createFromResource(this, R.array.pokemon_classification,
                        android.R.layout.simple_list_item_1);
        pokemonListView.setAdapter(pokemonClassificationStringArray);
    }

}

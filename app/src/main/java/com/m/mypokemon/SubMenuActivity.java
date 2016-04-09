package com.m.mypokemon;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubMenuActivity extends ListActivity {

    public static String SUB_MENU_OPTION = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView pokemonListView = getListView();
        Intent intent = getIntent();
        int subMenuOption = intent.getIntExtra(SUB_MENU_OPTION, -1);
        Integer stringArrayId = null;

        switch (subMenuOption){
            case 0:
                stringArrayId = R.array.pokemon_classification;
                break;
            case 1:
                stringArrayId = R.array.pokemon_types;
                break;
        }

        if (stringArrayId != null) {
            ArrayAdapter<CharSequence> pokemonClassificationStringArray = ArrayAdapter.
                    createFromResource(this, stringArrayId,
                            android.R.layout.simple_list_item_1);
            pokemonListView.setAdapter(pokemonClassificationStringArray);
        }
    }

}

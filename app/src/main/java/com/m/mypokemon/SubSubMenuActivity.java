package com.m.mypokemon;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SubSubMenuActivity extends ListActivity {

    public static MainMenuOption mainMenuOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView subSubMenuOptions = getListView();
        Intent intent = getIntent();
        mainMenuOption = (MainMenuOption) intent.getSerializableExtra(MainMenuActivity.OPTION);
        Integer stringArrayId = null;

        switch (mainMenuOption) {
            case POKEMON:
                PKMClassification pkmClassification =
                        (PKMClassification) intent.getSerializableExtra(SubMenuActivity.OPTION);
                switch (pkmClassification) {
                    case STARTER:
                        stringArrayId = R.array.regions;
                        break;
                    case LEGENDARY:
                        stringArrayId = R.array.legendary_classification;
                }
                break;
            case BADGES:
                League league = (League) intent.getSerializableExtra(SubMenuActivity.OPTION);
                switch (league) {
                    case INDIGO:
                        stringArrayId = R.array.indigo_league;
                        break;
                    case ORANGE:
                        stringArrayId = R.array.orange_league;
                        break;
                    case JOHTO:
                        stringArrayId = R.array.johto_league;
                        break;
                    case HOENN:
                        stringArrayId = R.array.hoenn_league;
                        break;
                    case SINNOH:
                        stringArrayId = R.array.sinnoh_league;
                        break;
                    case UNOVA:
                        stringArrayId = R.array.unova_league;
                        break;
                    case KALOS:
                        stringArrayId = R.array.kalos_league;
                        break;
                }
                break;
        }

        if (stringArrayId != null) {
            ArrayAdapter<CharSequence> subSubMenuOptionsArrayAdapter = ArrayAdapter.
                    createFromResource(this, stringArrayId,
                            android.R.layout.simple_list_item_1);
            subSubMenuOptions.setAdapter(subSubMenuOptionsArrayAdapter);
        }
    }

}

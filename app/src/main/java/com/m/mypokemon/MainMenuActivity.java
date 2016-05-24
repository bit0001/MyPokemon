package com.m.mypokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainMenuActivity extends AppCompatActivity {

    public static final String OPTION = "mainMenuOption";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainMenuActivity.this, SubMenuActivity.class);
                intent.putExtra(OPTION, MainMenuOption.values()[position]);
                startActivity(intent);
            }
        };

        ListView listView = (ListView) findViewById(R.id.main_menu_options);

        if (listView != null) {
            listView.setOnItemClickListener(itemClickListener);
        }
    }
}

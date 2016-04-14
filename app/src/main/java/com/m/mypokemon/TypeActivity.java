package com.m.mypokemon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TypeActivity extends AppCompatActivity {

    public static final String POKEMON_TYPE = "pokemonType";
    public static Type type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        type = Type.NORMAL;

        TextView name = (TextView) findViewById(R.id.type_name);
        ImageView image = (ImageView) findViewById(R.id.type_image);


        name.setText(type.getName());
        image.setImageResource(type.getImageId());
    }

}

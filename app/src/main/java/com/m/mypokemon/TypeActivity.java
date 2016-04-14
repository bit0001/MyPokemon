package com.m.mypokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TypeActivity extends AppCompatActivity {

    public static final String POKEMON_TYPE = "pokemonType";
    public static Type type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        Intent intent = getIntent();
        PokemonType chosenType = PokemonType.values()[intent.getIntExtra(POKEMON_TYPE, -1)];

        switch (chosenType) {
            case NORMAL:
                type = Type.NORMAL;
                break;
            case FIGHT:
                type = Type.FIGHT;
                break;
            case FLYING:
                type = Type.FLYING;
                break;
            case POISON:
                type = Type.POISON;
                break;
            case GROUND:
                type = Type.GROUND;
                break;
            case ROCK:
                type = Type.ROCK;
                break;
            case BUG:
                type = Type.BUG;
                break;
            case GHOST:
                type = Type.GHOST;
                break;
            case STEEL:
                type = Type.STEEL;
                break;
            case FIRE:
                type = Type.FIRE;
                break;
            case WATER:
                type = Type.WATER;
                break;
            case GRASS:
                type = Type.GRASS;
                break;
            case ELECTRIC:
                type = Type.ELECTRIC;
                break;
            case PSYCHIC:
                type = Type.PSYCHIC;
                break;
            case ICE:
                type = Type.ICE;
                break;
            case DRAGON:
                type = Type.DRAGON;
                break;
            case DARK:
                type = Type.DARK;
                break;
            case FAIRY:
                type = Type.FAIRY;
                break;
        }


        TextView name = (TextView) findViewById(R.id.type_name);
        ImageView image = (ImageView) findViewById(R.id.type_image);


        name.setText(type.getName());
        image.setImageResource(type.getImageId());
    }

}

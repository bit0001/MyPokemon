package com.m.mypokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TypeActivity extends AppCompatActivity {

    public static final String POKEMON_TYPE = "pokemonType";
    public static Type type;
    private GridView gridView;
    private TypeGridViewAdapter typeGridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        Intent intent = getIntent();
        getPokemonType(PokemonType.values()[intent.getIntExtra(POKEMON_TYPE, -1)]);

        TextView name = (TextView) findViewById(R.id.type_name);
        ImageView image = (ImageView) findViewById(R.id.type_image);

        assert name != null;
        assert image != null;
        name.setText(type.getName());
        image.setImageResource(type.getImageId());

        gridView = (GridView) findViewById(R.id.grid_of_types);
        typeGridViewAdapter = new TypeGridViewAdapter(this, R.layout.type_item_layout, getData());
        gridView.setAdapter(typeGridViewAdapter);

    }

    private ArrayList<ImageItem> getData() {
        ArrayList<ImageItem> imageItems = new ArrayList<>();
        ArrayList<Type> types = type.getOffensive().getNormal();

        for (Type anotherType: types) {
            imageItems.add(new ImageItem(anotherType.getName(), anotherType.getImageId()));
        }

        return imageItems;
    }

    private void getPokemonType(PokemonType chosenType) {
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
    }

}

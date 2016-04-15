package com.m.mypokemon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class TypeActivity extends AppCompatActivity {

    public static final String POKEMON_TYPE = "pokemonType";
    private Type type;
    private GridView gridView;
    private TypeGridViewAdapter typeGridViewAdapter;
    private Switch typeSwitch;
    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        getPokemonType();
        setToolbarTitle();

        ImageView image = (ImageView) findViewById(R.id.type_image);
        assert image != null;
        image.setImageResource(type.getImageId());

        typeSwitch = (Switch) findViewById(R.id.type_switch);

        selectedRadioButton = (RadioButton) findViewById(R.id.super_effective);
        selectedRadioButton.setChecked(true);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);

        gridView = (GridView) findViewById(R.id.grid_of_types);
        typeGridViewAdapter = new TypeGridViewAdapter(this, R.layout.type_item_layout, getData());
        gridView.setAdapter(typeGridViewAdapter);
    }

    private void setToolbarTitle() {
        TextView toolbarTitle = (TextView) findViewById(R.id.main_toolbar_title);
        toolbarTitle.setText(type.getName());
    }

    private ArrayList<ImageItem> getData() {
        ArrayList<ImageItem> imageItems = new ArrayList<>();
        TypeProperty typeProperty =
                typeSwitch.isChecked()? type.getOffensive(): type.getDefensive();



        for (Type anotherType: new ArrayList<Type>()) {
            imageItems.add(new ImageItem(anotherType.getName(), anotherType.getImageId()));
        }

        return imageItems;
    }

    private void getPokemonType() {
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
    }

    public void onSwitchClicked(View view) {
        // Is the switch on?
        boolean on = ((Switch) view).isChecked(); // This is very similar code to that used with the toggle button.
        if (on) {
            System.out.println("THIS IS ON");
        } else {
            System.out.println("THIS IS OFF");
        }
    }


}

package com.m.mypokemon.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.m.mypokemon.ui.views.ImageItem;
import com.m.mypokemon.helpers.PokemonType;
import com.m.mypokemon.R;
import com.m.mypokemon.models.Type;
import com.m.mypokemon.ui.adapters.TypeGridViewAdapter;
import com.m.mypokemon.models.TypeProperty;

import java.util.ArrayList;

public class TypeActivity extends AppCompatActivity {

    public static final String POKEMON_TYPE = "pokemonType";
    private Type type;
    private GridView gridView;
    private TypeGridViewAdapter typeGridViewAdapter;
    private Switch typeSwitch;
    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;
    private TextView noTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        getPokemonType();
        setToolbarTitle();

        ImageView image = (ImageView) findViewById(R.id.type_image);
        assert image != null;
        image.setImageResource(type.getImageId());

        noTypes = (TextView) findViewById(R.id.no_types);

        typeSwitch = (Switch) findViewById(R.id.type_switch);
        typeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                populateTypeGrid();
            }
        });

        selectedRadioButton = (RadioButton) findViewById(R.id.super_effective);
        selectedRadioButton.setChecked(true);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);


        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        populateTypeGrid();
                    }
                }

        );

        populateTypeGrid();
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageItem item = (ImageItem) parent.getItemAtPosition(position);
                if (!(item.getTitle().toLowerCase().equals(type.getName().toLowerCase()))) {
                    Intent intent = new Intent(TypeActivity.this, TypeActivity.class);
                    intent.putExtra(POKEMON_TYPE, PokemonType.getTypeByName(item.getTitle().toLowerCase()));
                    startActivity(intent);
                } else {
                    Toast.makeText(TypeActivity.this, "You are currently in " + type.getName() + " type.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void populateTypeGrid() {
        gridView = (GridView) findViewById(R.id.grid_of_types);
        typeGridViewAdapter = new TypeGridViewAdapter(TypeActivity.this, R.layout.type_item_layout, getData());
        gridView.setAdapter(typeGridViewAdapter);
    }

    private void setToolbarTitle() {
        TextView toolbarTitle = (TextView) findViewById(R.id.main_toolbar_title);
        toolbarTitle.setText(type.getName());
    }

    private ArrayList<ImageItem> getData() {
        ArrayList<ImageItem> imageItems = new ArrayList<>();
        ArrayList<Type> types = null;
        TypeProperty typeProperty =
                typeSwitch.isChecked()? type.getDefensive(): type.getOffensive();

        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.super_effective:
                types = typeProperty.getSuperEffective();
                break;
            case R.id.normally_effective:
                types = typeProperty.getNormal();
                break;
            case R.id.not_very_effective:
                types = typeProperty.getNotVeryEffective();
                break;
            case R.id.ineffective:
                types = typeProperty.getIneffective();
                break;
        }

        noTypes.setVisibility(types.isEmpty()? View.VISIBLE: View.GONE);
        gridView.setVisibility(types.isEmpty()? View.GONE: View.VISIBLE);

        for (Type anotherType: types) {
            imageItems.add(new ImageItem(anotherType.getName(), anotherType.getImageId()));
        }

        return imageItems;
    }

    private void getPokemonType() {
        Intent intent = getIntent();
        PokemonType chosenType = (PokemonType) intent.getSerializableExtra(POKEMON_TYPE);
        switch (chosenType) {
            case NORMAL:
                type = Type.NORMAL;
                break;
            case FIGHTING:
                type = Type.FIGHTING;
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

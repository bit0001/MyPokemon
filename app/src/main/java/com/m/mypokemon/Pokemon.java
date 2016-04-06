package com.m.mypokemon;

public class Pokemon {
    public static final String[][] POKEMON_LISTS = {
            {"Bulbasaur", "Charmander", "Squirtle"},
            {"Moltres", "Zapdos", "Articuno"},
            {"Entei", "Raikou", "Suicune"}};

    public static final Pokemon[] STARTERS = {
            new Pokemon("Bulbasaur", R.string.bulbasaur, R.drawable.bulbasaur),
            new Pokemon("Charmander", R.string.charmander, R.drawable.charmander),
            new Pokemon("Squirtle", R.string.squirtle, R.drawable.squirtle)
    };

    public static final Pokemon[] LEGENDARY_BIRDS = {
            new Pokemon("Moltres", R.string.moltres, R.drawable.moltres),
            new Pokemon("Zapdos", R.string.zapdos, R.drawable.zapdos),
            new Pokemon("Articuno", R.string.articuno, R.drawable.articuno)
    };

    public static final Pokemon[] LEGENDARY_BEASTS = {
            new Pokemon("Entei", R.string.entei, R.drawable.entei),
            new Pokemon("Raikou", R.string.raikou, R.drawable.raikou),
            new Pokemon("Suicuine", R.string.suicune, R.drawable.suicune)
    };

    private String name;
    private int informationId;
    private int photoId;

    public Pokemon(String name, int informationId, int photoId) {
        this.name = name;
        this.informationId = informationId;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public int getInformationId() {
        return informationId;
    }

    public int getPhotoId() {
        return photoId;
    }
}

package com.m.mypokemon;

public class Pokemon {
    public static final String[][] POKEMON_LISTS = {
            {"Bulbasaur", "Charmander", "Squirtle"},
            {"Moltres", "Zapdos", "Articuno"},
            {"Entei", "Raikou", "Suicune"}};

    public static final Pokemon[] STARTERS = {
            new Pokemon("Bulbasaur", R.string.bulbasaur, R.drawable.bulbasaur)
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

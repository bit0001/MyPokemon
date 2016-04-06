package com.m.mypokemon;

public class Pokemon {
    public static final String[][] POKEMON_LISTS = {
            {"Bulbasaur", "Charmander", "Squirtle"},
            {"Moltres", "Zapdos", "Articuno"},
            {"Entei", "Raikou", "Suicune"}};

    private String name;
    private String information;
    private int photoId;

    public Pokemon(String name, String information, int photoId) {
        this.name = name;
        this.information = information;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }

    public int getPhotoId() {
        return photoId;
    }
}

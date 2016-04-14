package com.m.mypokemon;

public enum Type {
    NORMAL("Normal", R.drawable.normal),
    FIGHT("Fight", R.drawable.fight),
    FLYING("Flying", R.drawable.flying),
    POISON("Poison", R.drawable.poison),
    GROUND("Ground", R.drawable.ground),
    ROCK("Rock", R.drawable.rock),
    BUG("Bug", R.drawable.bug),
    GHOST("Ghost", R.drawable.ghost),
    STEEL("Steel", R.drawable.steel),
    FIRE("Fire", R.drawable.fire),
    WATER("Water", R.drawable.water),
    GRASS("Grass", R.drawable.grass),
    ELECTRIC("Electric", R.drawable.electric),
    PSYCHIC("Psychic", R.drawable.psychic),
    ICE("Ice", R.drawable.ice),
    DRAGON("Dragon", R.drawable.dragon),
    DARK("Dark", R.drawable.dark),
    FAIRY("Fairy", R.drawable.fairy);

    private String name;
    private int photoId;

    Type(String name, int photoId) {
        this.name = name;
        this.photoId = photoId;
    }
}

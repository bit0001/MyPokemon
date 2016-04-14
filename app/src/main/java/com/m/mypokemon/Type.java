package com.m.mypokemon;

public enum Type {
    NORMAL("Normal", R.drawable.normal,
            new TypeProperty(), new TypeProperty()),
    FIGHT("Fight", R.drawable.fight,
            new TypeProperty(), new TypeProperty()),
    FLYING("Flying", R.drawable.flying,
            new TypeProperty(), new TypeProperty()),
    POISON("Poison", R.drawable.poison,
            new TypeProperty(), new TypeProperty()),
    GROUND("Ground", R.drawable.ground,
           new TypeProperty(), new TypeProperty()),
    ROCK("Rock", R.drawable.rock,
            new TypeProperty(), new TypeProperty()),
    BUG("Bug", R.drawable.bug,
            new TypeProperty(), new TypeProperty()),
    GHOST("Ghost", R.drawable.ghost,
            new TypeProperty(), new TypeProperty()),
    STEEL("Steel", R.drawable.steel,
            new TypeProperty(), new TypeProperty()),
    FIRE("Fire", R.drawable.fire,
            new TypeProperty(), new TypeProperty()),
    WATER("Water", R.drawable.water,
            new TypeProperty(), new TypeProperty()),
    GRASS("Grass", R.drawable.grass,
            new TypeProperty(), new TypeProperty()),
    ELECTRIC("Electric", R.drawable.electric,
            new TypeProperty(), new TypeProperty()),
    PSYCHIC("Psychic", R.drawable.psychic,
            new TypeProperty(), new TypeProperty()),
    ICE("Ice", R.drawable.ice,
            new TypeProperty(), new TypeProperty()),
    DRAGON("Dragon", R.drawable.dragon,
            new TypeProperty(), new TypeProperty()),
    DARK("Dark", R.drawable.dark,
            new TypeProperty(), new TypeProperty()),
    FAIRY("Fairy", R.drawable.fairy,
            new TypeProperty(), new TypeProperty());

    private String name;
    private int photoId;
    private TypeProperty offensive;
    private TypeProperty defensive;

    Type(TypeProperty defensive, int photoId, String name, TypeProperty offensive) {
        this.defensive = defensive;
        this.photoId = photoId;
        this.name = name;
        this.offensive = offensive;
    }
}

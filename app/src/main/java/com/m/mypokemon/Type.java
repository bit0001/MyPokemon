package com.m.mypokemon;

public class Type {
    public static Type NORMAL;
    public static Type FIGHT = new Type("Fight", R.drawable.fight, new TypeProperty(), new TypeProperty());
    public static Type FLYING = new Type("Flying", R.drawable.flying, new TypeProperty(), new TypeProperty());
    public static Type POISON = new Type("Poison", R.drawable.poison, new TypeProperty(), new TypeProperty());
    public static Type GROUND = new Type("Ground", R.drawable.ground, new TypeProperty(), new TypeProperty());
    public static Type ROCK = new Type("Rock", R.drawable.rock, new TypeProperty(), new TypeProperty());
    public static Type BUG = new Type("Bug", R.drawable.bug, new TypeProperty(), new TypeProperty());
    public static Type GHOST = new Type("Ghost", R.drawable.ghost, new TypeProperty(), new TypeProperty());
    public static Type STEEL = new Type("Steel", R.drawable.steel, new TypeProperty(), new TypeProperty());
    public static Type FIRE = new Type("Fire", R.drawable.fire, new TypeProperty(), new TypeProperty());
    public static Type WATER = new Type("Water", R.drawable.water, new TypeProperty(), new TypeProperty());
    public static Type GRASS = new Type("Grass", R.drawable.grass, new TypeProperty(), new TypeProperty());
    public static Type ELECTRIC = new Type("Electric", R.drawable.electric, new TypeProperty(), new TypeProperty());
    public static Type PSYCHIC = new Type("Psychic", R.drawable.psychic, new TypeProperty(), new TypeProperty());
    public static Type ICE = new Type("Ice", R.drawable.ice, new TypeProperty(), new TypeProperty());
    public static Type DRAGON = new Type("Dragon", R.drawable.dragon, new TypeProperty(), new TypeProperty());
    public static Type DARK = new Type("Dark", R.drawable.dark, new TypeProperty(), new TypeProperty());
    public static Type FAIRY = new Type("Fairy", R.drawable.fairy, new TypeProperty(), new TypeProperty());

    static {
        NORMAL = new Type("Normal", R.drawable.normal,
                new TypeProperty()
                        .addNormalType(NORMAL)
                        .addNormalType(FIGHT)
                        .addNormalType(FLYING)
                        .addNormalType(POISON)
                        .addNormalType(GROUND)
                        .addNotVeryEffectiveType(ROCK)
                        .addNormalType(BUG)
                        .addIneffectiveType(GHOST)
                        .addNotVeryEffectiveType(STEEL)
                        .addNormalType(FIRE)
                        .addNormalType(WATER)
                        .addNormalType(GRASS)
                        .addNormalType(ELECTRIC)
                        .addNormalType(PSYCHIC)
                        .addNormalType(ICE)
                        .addNormalType(DRAGON)
                        .addNormalType(DARK)
                        .addNormalType(FAIRY),
                new TypeProperty()
                        .addNormalType(NORMAL)
                        .addSuperEffectiveType(FIGHT)
                        .addNormalType(FLYING)
                        .addNormalType(POISON)
                        .addNormalType(GROUND)
                        .addNormalType(ROCK)
                        .addNormalType(BUG)
                        .addIneffectiveType(GHOST)
                        .addNormalType(STEEL)
                        .addNormalType(FIRE)
                        .addNormalType(WATER)
                        .addNormalType(GRASS)
                        .addNormalType(ELECTRIC)
                        .addNormalType(PSYCHIC)
                        .addNormalType(ICE)
                        .addNormalType(DRAGON)
                        .addNormalType(DARK)
                        .addNormalType(FAIRY)
        );
    }

    private String name;
    private int photoId;
    private TypeProperty offensive;
    private TypeProperty defensive;

    Type(String name, int photoId, TypeProperty offensive, TypeProperty defensive) {
        this.photoId = photoId;
        this.name = name;
        this.offensive = offensive;
        this.defensive = defensive;
    }
}

package com.m.mypokemon;

public class Type {
    public static Type NORMAL = new Type("Normal", R.drawable.normal, new TypeProperty(), new TypeProperty());
    public static Type FIGHTING = new Type("Fighting", R.drawable.fighting, new TypeProperty(), new TypeProperty());
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
        NORMAL.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
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
                .addNormalType(FAIRY);
        NORMAL.defensive
                .addNormalType(NORMAL)
                .addSuperEffectiveType(FIGHTING)
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
                .addNormalType(FAIRY);

        FIGHTING.offensive
                .addSuperEffectiveType(NORMAL)
                .addNormalType(FIGHTING)
                .addNotVeryEffectiveType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addNormalType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addIneffectiveType(GHOST)
                .addSuperEffectiveType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addNormalType(GRASS)
                .addNormalType(ELECTRIC)
                .addNotVeryEffectiveType(PSYCHIC)
                .addSuperEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addSuperEffectiveType(DARK)
                .addNotVeryEffectiveType(FAIRY);
        FIGHTING.defensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addSuperEffectiveType(FLYING)
                .addNormalType(POISON)
                .addNormalType(GROUND)
                .addNotVeryEffectiveType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addNormalType(GRASS)
                .addNormalType(ELECTRIC)
                .addSuperEffectiveType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNotVeryEffectiveType(DARK)
                .addSuperEffectiveType(FAIRY);

        FLYING.offensive
                .addNormalType(NORMAL)
                .addSuperEffectiveType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addNormalType(GROUND)
                .addNotVeryEffectiveType(ROCK)
                .addSuperEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addSuperEffectiveType(GRASS)
                .addNotVeryEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
        FLYING.defensive
                .addNormalType(NORMAL)
                .addNotVeryEffectiveType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addIneffectiveType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addSuperEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addSuperEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
    }

    private String name;
    private int imageId;
    private TypeProperty offensive;
    private TypeProperty defensive;

    Type(String name, int imageId, TypeProperty offensive, TypeProperty defensive) {
        this.imageId = imageId;
        this.name = name;
        this.offensive = offensive;
        this.defensive = defensive;
    }

    public TypeProperty getDefensive() {
        return defensive;
    }

    public String getName() {
        return name;
    }

    public TypeProperty getOffensive() {
        return offensive;
    }

    public int getImageId() {
        return imageId;
    }
}

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

        POISON.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addNotVeryEffectiveType(GROUND)
                .addNotVeryEffectiveType(ROCK)
                .addNormalType(BUG)
                .addNotVeryEffectiveType(GHOST)
                .addIneffectiveType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addSuperEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addSuperEffectiveType(FAIRY);
        POISON.defensive
                .addNormalType(NORMAL)
                .addNotVeryEffectiveType(FIGHTING)
                .addNormalType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addSuperEffectiveType(GROUND)
                .addNormalType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addSuperEffectiveType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNotVeryEffectiveType(FAIRY);

        GROUND.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addIneffectiveType(FLYING)
                .addSuperEffectiveType(POISON)
                .addNormalType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addNormalType(GHOST)
                .addSuperEffectiveType(STEEL)
                .addSuperEffectiveType(FIRE)
                .addNormalType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addSuperEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
        GROUND.defensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addNormalType(GROUND)
                .addNotVeryEffectiveType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addNormalType(FIRE)
                .addSuperEffectiveType(WATER)
                .addSuperEffectiveType(GRASS)
                .addIneffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addSuperEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);

        ROCK.offensive
                .addNormalType(NORMAL)
                .addNotVeryEffectiveType(FIGHTING)
                .addSuperEffectiveType(FLYING)
                .addNormalType(POISON)
                .addNotVeryEffectiveType(GROUND)
                .addNormalType(ROCK)
                .addSuperEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addSuperEffectiveType(FIRE)
                .addNormalType(WATER)
                .addNormalType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addSuperEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
        ROCK.defensive
                .addNotVeryEffectiveType(NORMAL)
                .addSuperEffectiveType(FIGHTING)
                .addNotVeryEffectiveType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addSuperEffectiveType(GROUND)
                .addNormalType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addSuperEffectiveType(STEEL)
                .addNotVeryEffectiveType(FIRE)
                .addSuperEffectiveType(WATER)
                .addSuperEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);

        BUG.offensive
                .addNormalType(NORMAL)
                .addNotVeryEffectiveType(FIGHTING)
                .addNotVeryEffectiveType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addNormalType(GROUND)
                .addNormalType(ROCK)
                .addNormalType(BUG)
                .addNotVeryEffectiveType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addNotVeryEffectiveType(FIRE)
                .addNormalType(WATER)
                .addSuperEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addSuperEffectiveType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addSuperEffectiveType(DARK)
                .addNotVeryEffectiveType(FAIRY);
        BUG.defensive
                .addNormalType(NORMAL)
                .addNotVeryEffectiveType(FIGHTING)
                .addSuperEffectiveType(FLYING)
                .addNormalType(POISON)
                .addNotVeryEffectiveType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addSuperEffectiveType(FIRE)
                .addNormalType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);

        GHOST.offensive
                .addIneffectiveType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addNormalType(GROUND)
                .addNormalType(ROCK)
                .addNormalType(BUG)
                .addSuperEffectiveType(GHOST)
                .addNormalType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addNormalType(GRASS)
                .addNormalType(ELECTRIC)
                .addSuperEffectiveType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addNotVeryEffectiveType(DARK)
                .addNormalType(FAIRY);
        GHOST.defensive
                .addIneffectiveType(NORMAL)
                .addIneffectiveType(FIGHTING)
                .addNormalType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addNormalType(GROUND)
                .addNormalType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addSuperEffectiveType(GHOST)
                .addNormalType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addNormalType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNormalType(DRAGON)
                .addSuperEffectiveType(DARK)
                .addNormalType(FAIRY);

        STEEL.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addNormalType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addNotVeryEffectiveType(FIRE)
                .addNotVeryEffectiveType(WATER)
                .addNormalType(GRASS)
                .addNotVeryEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addSuperEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addSuperEffectiveType(FAIRY);
        STEEL.defensive
                .addNotVeryEffectiveType(NORMAL)
                .addSuperEffectiveType(FIGHTING)
                .addNotVeryEffectiveType(FLYING)
                .addIneffectiveType(POISON)
                .addSuperEffectiveType(GROUND)
                .addNotVeryEffectiveType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addSuperEffectiveType(FIRE)
                .addNormalType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNotVeryEffectiveType(PSYCHIC)
                .addNotVeryEffectiveType(ICE)
                .addNotVeryEffectiveType(DRAGON)
                .addNormalType(DARK)
                .addNotVeryEffectiveType(FAIRY);

        FIRE.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addNormalType(GROUND)
                .addNotVeryEffectiveType(ROCK)
                .addSuperEffectiveType(BUG)
                .addNormalType(GHOST)
                .addSuperEffectiveType(STEEL)
                .addNotVeryEffectiveType(FIRE)
                .addNotVeryEffectiveType(WATER)
                .addSuperEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addSuperEffectiveType(ICE)
                .addNotVeryEffectiveType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
        FIRE.defensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addSuperEffectiveType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addNotVeryEffectiveType(FIRE)
                .addSuperEffectiveType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNotVeryEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNotVeryEffectiveType(FAIRY);

        WATER.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addSuperEffectiveType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addSuperEffectiveType(FIRE)
                .addNotVeryEffectiveType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNotVeryEffectiveType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
        WATER.defensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNormalType(FLYING)
                .addNormalType(POISON)
                .addNormalType(GROUND)
                .addNormalType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addNotVeryEffectiveType(FIRE)
                .addNotVeryEffectiveType(WATER)
                .addSuperEffectiveType(GRASS)
                .addSuperEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNotVeryEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);

        GRASS.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNotVeryEffectiveType(FLYING)
                .addNotVeryEffectiveType(POISON)
                .addSuperEffectiveType(GROUND)
                .addSuperEffectiveType(ROCK)
                .addNotVeryEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addNotVeryEffectiveType(FIRE)
                .addSuperEffectiveType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNormalType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNotVeryEffectiveType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
        GRASS.defensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addSuperEffectiveType(FLYING)
                .addSuperEffectiveType(POISON)
                .addNotVeryEffectiveType(GROUND)
                .addNormalType(ROCK)
                .addSuperEffectiveType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addSuperEffectiveType(FIRE)
                .addNotVeryEffectiveType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNotVeryEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addSuperEffectiveType(ICE)
                .addNormalType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);

        ELECTRIC.offensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addSuperEffectiveType(FLYING)
                .addNormalType(POISON)
                .addIneffectiveType(GROUND)
                .addNormalType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addNormalType(STEEL)
                .addNormalType(FIRE)
                .addSuperEffectiveType(WATER)
                .addNotVeryEffectiveType(GRASS)
                .addNotVeryEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
                .addNotVeryEffectiveType(DRAGON)
                .addNormalType(DARK)
                .addNormalType(FAIRY);
        ELECTRIC.defensive
                .addNormalType(NORMAL)
                .addNormalType(FIGHTING)
                .addNotVeryEffectiveType(FLYING)
                .addNormalType(POISON)
                .addSuperEffectiveType(GROUND)
                .addNormalType(ROCK)
                .addNormalType(BUG)
                .addNormalType(GHOST)
                .addNotVeryEffectiveType(STEEL)
                .addNormalType(FIRE)
                .addNormalType(WATER)
                .addNormalType(GRASS)
                .addNotVeryEffectiveType(ELECTRIC)
                .addNormalType(PSYCHIC)
                .addNormalType(ICE)
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

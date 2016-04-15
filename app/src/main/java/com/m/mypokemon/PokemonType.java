package com.m.mypokemon;

public enum PokemonType {
    NORMAL, FIGHTING, FLYING, POISON, GROUND, ROCK, BUG, GHOST, STEEL, FIRE, WATER, GRASS, ELECTRIC,
    PSYCHIC, ICE, DRAGON, DARK, FAIRY;

    public static PokemonType getTypeByName(String type) {
        switch (type.toLowerCase()) {
            case "normal":
                return NORMAL;
            case "fighting":
                return FIGHTING;
            case "flying":
                return FLYING;
            case "poison":
                return POISON;
            case "ground":
                return GROUND;
            case "rock":
                return ROCK;
            case "bug":
                return BUG;
            case "ghost":
                return GHOST;
            case "steel":
                return STEEL;
            case "fire":
                return FIRE;
            case "water":
                return WATER;
            case "grass":
                return GRASS;
            case "electric":
                return ELECTRIC;
            case "psychic":
                return PSYCHIC;
            case "ice":
                return ICE;
            case "dragon":
                return DRAGON;
            case "dark":
                return DARK;
            case "fairy":
                return FAIRY;
        }
        return null;
    }
}

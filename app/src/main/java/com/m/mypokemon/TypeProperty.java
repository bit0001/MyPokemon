package com.m.mypokemon;

import java.util.ArrayList;

public class TypeProperty {
    private ArrayList<Type> superEffective;
    private ArrayList<Type> normal;
    private ArrayList<Type> notVeryEffective;
    private ArrayList<Type> inefficient;

    public TypeProperty() {
        this.superEffective = new ArrayList<>();
        this.normal = new ArrayList<>();
        this.notVeryEffective = new ArrayList<>();
        this.inefficient = new ArrayList<>();
    }

    public ArrayList<Type> getInefficient() {
        return inefficient;
    }

    public ArrayList<Type> getNormal() {
        return normal;
    }

    public ArrayList<Type> getNotVeryEffective() {
        return notVeryEffective;
    }

    public ArrayList<Type> getSuperEffective() {
        return superEffective;
    }
}

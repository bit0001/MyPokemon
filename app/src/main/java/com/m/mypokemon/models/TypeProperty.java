package com.m.mypokemon.models;

import java.util.ArrayList;

public class TypeProperty {
    private ArrayList<Type> superEffective;
    private ArrayList<Type> normal;
    private ArrayList<Type> notVeryEffective;
    private ArrayList<Type> ineffective;

    public TypeProperty() {
        this.superEffective = new ArrayList<>();
        this.normal = new ArrayList<>();
        this.notVeryEffective = new ArrayList<>();
        this.ineffective = new ArrayList<>();
    }

    public ArrayList<Type> getIneffective() {
        return ineffective;
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

    public TypeProperty addIneffectiveType(Type type) {
        ineffective.add(type);
        return this;
    }

    public TypeProperty addNormalType(Type type) {
        normal.add(type);
        return this;
    }

    public TypeProperty addNotVeryEffectiveType(Type type) {
        notVeryEffective.add(type);
        return this;
    }

    public TypeProperty addSuperEffectiveType(Type type) {
        superEffective.add(type);
        return this;
    }
}

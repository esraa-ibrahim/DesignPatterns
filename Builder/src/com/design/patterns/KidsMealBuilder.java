package com.design.patterns;

abstract class KidsMealBuilder {
    protected KidsMeal kidsMeal;

    KidsMeal getKidsMeal() {
        return kidsMeal;
    }

    void createNewKidsMeal() {
        kidsMeal = new KidsMeal();
    }

    abstract void buildMainItem();

    abstract void buildSideItem();

    abstract void buildDrink();

    abstract void buildToy();
}

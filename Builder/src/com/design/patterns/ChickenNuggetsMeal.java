package com.design.patterns;

class ChickenNuggetsMeal extends KidsMealBuilder {
    @Override
    void buildMainItem() {
        kidsMeal.setMainItem("Chicken Nuggets");
    }

    @Override
    void buildSideItem() {
        kidsMeal.setSideItem("Apple Slices");
    }

    @Override
    void buildDrink() {
        kidsMeal.setDrink("Milk");
    }

    @Override
    void buildToy() {
        kidsMeal.setToy("Dinosaur");
    }
}

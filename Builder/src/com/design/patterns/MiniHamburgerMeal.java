package com.design.patterns;

class MiniHamburgerMeal extends KidsMealBuilder {
    @Override
    void buildMainItem() {
        kidsMeal.setMainItem("Hamburger");
    }

    @Override
    void buildSideItem() {
        kidsMeal.setSideItem("Fries");
    }

    @Override
    void buildDrink() {
        kidsMeal.setDrink("Coca");
    }

    @Override
    void buildToy() {
        kidsMeal.setToy("Minion");
    }
}

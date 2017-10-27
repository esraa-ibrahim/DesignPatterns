package com.design.patterns;

public class Main {
    public static void main(String[] args) {
        KidsMealBuilder[] kidsMealBuilder = new KidsMealBuilder[2];
        kidsMealBuilder[0] = new MiniHamburgerMeal();
        kidsMealBuilder[1] = new ChickenNuggetsMeal();

        for (KidsMealBuilder kidsMealBuilderItem : kidsMealBuilder) {
            kidsMealBuilderItem.createNewKidsMeal();
            kidsMealBuilderItem.buildMainItem();
            kidsMealBuilderItem.buildSideItem();
            kidsMealBuilderItem.buildDrink();
            kidsMealBuilderItem.buildToy();

            KidsMeal kidsMeal = kidsMealBuilderItem.getKidsMeal();
            System.out.println(kidsMeal.toString());
        }
    }
}
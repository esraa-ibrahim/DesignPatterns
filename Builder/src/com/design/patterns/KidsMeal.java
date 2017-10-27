package com.design.patterns;

public class KidsMeal {
    private String mainItem;
    private String sideItem;
    private String drink;
    private String toy;

    void setMainItem(String mainItem) {
        this.mainItem = mainItem;
    }

    void setSideItem(String sideItem) {
        this.sideItem = sideItem;
    }

    void setDrink(String drink) {
        this.drink = drink;
    }

    void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return String.format("Kids Meal\n\tMain Item: %s\n\tSide Item: %s\n\tDrink: %s\n\tToy: %s",
                mainItem, sideItem, drink, toy);
    }
}

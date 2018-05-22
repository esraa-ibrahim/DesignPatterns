package com.design.patterns;

public class Main {
    public static void main(String[] args) {
        // Create instance from Strategy classes
        Strategy[] strategy = new Strategy[]{new PersonalCar(), new Taxi(), new CityBus()};

        for (int i = 0; i < strategy.length; i++) {
            strategy[i].drive();
        }
    }
}

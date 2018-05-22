package com.design.patterns;

public class CityBus implements Strategy {

    @Override
    public void drive() {
        System.out.println("Driving City Bus");
    }
}
package com.design.patterns;

public class Taxi implements Strategy {

    @Override
    public void drive() {
        System.out.println("Driving Taxi");
    }
}
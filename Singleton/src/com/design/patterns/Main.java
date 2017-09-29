package com.design.patterns;

public class Main {
    public static void main(String[] args) {
        // Create instance from Singleton class and set its data
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setId(1);
        singleton1.setText("Singleton 1");

        // When trying to create another instance it will return the same instance created above
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getId() + ", " + singleton2.getText());
    }
}

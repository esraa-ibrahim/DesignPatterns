package com.design.patterns;

class Singleton {
    private int id;
    private String text;

    private static Singleton instance = null;

    // Private constructor to prevent instance creation outside this class
    private Singleton() {
    }

    // Public method to be able to get instance of class
    static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }
}

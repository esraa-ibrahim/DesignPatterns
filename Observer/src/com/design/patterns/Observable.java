package com.design.patterns;

import java.util.ArrayList;
import java.util.List;

abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    void register(Observer observer) {
        observers.add(observer);
    }

    void unregister(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

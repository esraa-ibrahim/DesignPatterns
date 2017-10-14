package com.design.patterns;

class Article extends Observable {
    void publish() {
        System.out.println("New article has been published");
        notifyObservers();
    }
}

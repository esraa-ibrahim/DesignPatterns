package com.design.patterns;

public class Follower implements Observer {
    private int followerId;

    Follower(int id) {
        this.followerId = id;
    }

    @Override
    public void update() {
        System.out.printf("Follower %d has been updated%n", followerId);
    }
}

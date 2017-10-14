package com.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        List<Follower> followers = new ArrayList<>();
        Follower f1 = new Follower(1),
                f2 = new Follower(2),
                f3 = new Follower(3);
        followers.add(f1);
        followers.add(f2);
        followers.add(f3);

        for (Follower follower : followers) {
            article.register(follower);
        }

        article.publish();

        System.out.println("=========================");

        article.unregister(f2);
        article.publish();
    }
}

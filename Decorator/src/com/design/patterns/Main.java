package com.design.patterns;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        // Draw normal circle
        circle.draw();

        System.out.println("=========================");

        // Draw decorated circle
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        System.out.println("=========================");

        // Draw decorated rectangle
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}

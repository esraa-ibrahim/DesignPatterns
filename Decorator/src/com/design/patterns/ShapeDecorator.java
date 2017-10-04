package com.design.patterns;

class ShapeDecorator implements Shape {
    Shape mShape;

    ShapeDecorator(Shape shape) {
        mShape = shape;
    }

    @Override
    public void draw() {
        mShape.draw();
    }
}

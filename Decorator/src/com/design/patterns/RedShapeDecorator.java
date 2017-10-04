package com.design.patterns;

public class RedShapeDecorator extends ShapeDecorator {
    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        mShape.draw();
        setRedBorder(mShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

package com.onurcan;

interface Shape {
    void draw();

    default void m1() {
        System.out.println("m1 default method.");
    }
}


public class LambdaExample {
    public static void main(String[] args) {

        print(() -> System.out.println("Rectangle class : draw() method "));
        print(() -> {System.out.println("Square class : draw() method ");});
        print(() -> System.out.println("Circle class : draw() method "));
//        print(rectangle);
//        print(square);
//        print(circle);
    }

    private static void print(Shape shape) {
        shape.draw();
        shape.m1();
    }
}

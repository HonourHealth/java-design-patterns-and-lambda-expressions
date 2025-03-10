package com.lamdaexpressionsandmethodreferences.methodref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface PrintTable {
    void print(String msg);
}

public class MethodReferencesDemo {

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
//        Function<Integer, Double> function = (input) -> Math.sqrt(input);
//        System.out.println(function.apply(4));

        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

//        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferencesDemo.addition(a, b);
//        System.out.println(biFunctionLambda.apply(10, 20));

        BiFunction<Integer, Integer, Integer> biFunctionLambda = MethodReferencesDemo::addition;
        System.out.println(biFunctionLambda.apply(10, 20));

        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
//        PrintTable printTable = (msg) -> methodReferencesDemo.display(msg);
//        printTable.print("hello world1!");
        PrintTable printTable = methodReferencesDemo::display;
        printTable.print("hello world2!");

//        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
//        System.out.println(stringFunction.apply("Text Message"));

        Function<String, String> stringFunction = String::toLowerCase;
        System.out.println(stringFunction.apply("TEST TEST"));

        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("watermelon");

//        Function<List<String>, Set<String>> setFunction = fruitsList -> new HashSet<>(fruitsList);
//        System.out.println(setFunction.apply(fruits));

        Function<List<String>, Set<String>> setFunction = HashSet::new;
        System.out.println(setFunction.apply(fruits));
    }
}

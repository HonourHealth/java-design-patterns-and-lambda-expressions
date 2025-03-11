package com.designpatterns.creationalpatterns.singletonpattern.lazyloading;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance("FOO");
        DoubleCheckedLockingSingleton anotherDoubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance("BAR");
        System.out.println(doubleCheckedLockingSingleton.value);
        System.out.println(anotherDoubleCheckedLockingSingleton.value);
    }
}

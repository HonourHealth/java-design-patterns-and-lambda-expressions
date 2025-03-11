package com.designpatterns.creationalpatterns.singletonpattern.threaded;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("FOO");
        ThreadSafeSingleton anotherThreadSafeSingleton = ThreadSafeSingleton.getInstance("BAR");
        System.out.println(threadSafeSingleton.value);
        System.out.println(anotherThreadSafeSingleton.value);
    }
}

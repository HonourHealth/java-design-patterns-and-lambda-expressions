package com.designpatterns.creationalpatterns.singletonpattern.threaded;

public final class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    public String value;

    private ThreadSafeSingleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static synchronized ThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            instance = new ThreadSafeSingleton(value);
        }
        return instance;
    }
}

package com.designpatterns.creationalpatterns.singletonpattern.lazyloading;

public class DoubleCheckedLockingSingleton {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile DoubleCheckedLockingSingleton instance;

    public String value;

    private DoubleCheckedLockingSingleton(String value) {
        this.value = value;
    }

    public static DoubleCheckedLockingSingleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.

        DoubleCheckedLockingSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (DoubleCheckedLockingSingleton.class) {
            if (instance == null) {
                instance = new DoubleCheckedLockingSingleton(value);
            }
            return instance;
        }
    }
}


package com.onurcan;

class TreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("run method called ...");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new TreadDemo());
        thread.start();
        
        Thread threadLambda = new Thread(() -> System.out.println("run method called using lambda ..."));
        threadLambda.start();
    }
}

package com.sda.singleton;

public class App {
    static class Task1 implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
    }

    static class Task2 implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
    }
    public static void main( String[] args )
    {
        System.getSecurityManager();
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();
    }
}

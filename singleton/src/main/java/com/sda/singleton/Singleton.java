package com.sda.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Creating instance: " + this);
    }

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

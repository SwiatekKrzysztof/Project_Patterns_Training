package com.sda.patterns.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void connection(){
        System.out.println("Enum singleton");
    }
}

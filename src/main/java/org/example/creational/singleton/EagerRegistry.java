package org.example.creational.singleton;

public class EagerRegistry {

    private EagerRegistry(){

    }

    private final static EagerRegistry INSTANCE = new EagerRegistry();


    public static EagerRegistry getInstance(){
        return INSTANCE;
    }
}

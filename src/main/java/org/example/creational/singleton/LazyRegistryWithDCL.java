package org.example.creational.singleton;

public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL(){

    }

    private volatile static LazyRegistryWithDCL INSTANCE;


    public static LazyRegistryWithDCL getInstance(){

        if(INSTANCE==null){
            synchronized (LazyRegistryWithDCL.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }

        return INSTANCE;
    }
}

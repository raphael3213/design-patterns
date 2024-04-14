package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {

        EagerRegistry registry1 = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();

        System.out.println(registry1 == registry2);


        LazyRegistryWithIODH singleton1 = LazyRegistryWithIODH.getInstance();
        LazyRegistryWithIODH singleton2 = LazyRegistryWithIODH.getInstance();
        LazyRegistryWithIODH singleton3 = LazyRegistryWithIODH.getInstance();
        LazyRegistryWithIODH singleton4 = LazyRegistryWithIODH.getInstance();

        EnumRegistry.INSTANCE.getConfiguration();
    }
}

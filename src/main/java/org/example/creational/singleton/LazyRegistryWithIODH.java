package org.example.creational.singleton;

public class LazyRegistryWithIODH {

    private LazyRegistryWithIODH() {
        System.out.println("Hi, I am Initialized");
    }

    private static class RegistryHolder {
        //Static nested classes are only loaded by JVM on first reference and they are also loaded in a thread safe manner by Java

        static final LazyRegistryWithIODH INSTANCE = new LazyRegistryWithIODH();
    }

    public static LazyRegistryWithIODH getInstance(){
        // In this case only when I call this method will the LazyRegistry be initialized
        return RegistryHolder.INSTANCE;
    }
}

/**
 *
 * Initialization-on-demand: The instance of LazyRegistryWithIODH is created inside a static inner class called RegistryHolder. This inner class is only loaded and initialized when it's explicitly referenced (in this case, when getInstance() is called). This ensures lazy initialization, meaning the instance is created only when it's needed.
 *
 * Class Loader Guarantee: The Java class loader ensures that the initialization of a class is thread-safe. When a class is loaded by the JVM, the class loader ensures that the class initialization process is performed in a thread-safe manner. This means that the static fields of a class, including those in static inner classes, are initialized in a thread-safe manner.
 *
 * Static Initialization: The initialization of static fields in Java is inherently thread-safe. The JVM ensures that the initialization of static fields is atomic and ordered, guaranteeing that the INSTANCE variable in RegistryHolder is initialized safely and once.
 *
 * No Synchronization Needed: Since the initialization of INSTANCE is performed during class loading, which is inherently thread-safe, there is no need for additional synchronization mechanisms like locks or synchronized blocks.
 *
 *
 * */
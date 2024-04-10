package org.example.creational.abstractfactory.instance;

import org.example.creational.abstractfactory.storage.Storage;

public abstract class Instance {

    public static enum Capacity {micro , small, large}


    public abstract void start();

    public abstract void stop();

    public abstract void attachStorage(Storage storage);

}

package org.example.creational.abstractfactory.storage;

import java.util.Random;

public abstract class Storage {

    protected String id;
    protected Integer Mib;

    protected abstract String getId();

    protected Storage(int Mib){
        this.id = Integer.toString(new Random().nextInt(1000));
        this.Mib = Mib;
    }
}

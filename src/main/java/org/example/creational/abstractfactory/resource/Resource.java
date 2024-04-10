package org.example.creational.abstractfactory.resource;

import org.example.creational.abstractfactory.instance.Instance;
import org.example.creational.abstractfactory.storage.Storage;

public abstract class Resource {

    private Instance instance;
    private Storage storage;

    public abstract Instance getInstance();

    public abstract String toString();
}

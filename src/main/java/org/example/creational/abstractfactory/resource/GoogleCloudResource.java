package org.example.creational.abstractfactory.resource;

import org.example.creational.abstractfactory.instance.Instance;
import org.example.creational.abstractfactory.storage.Storage;

public class GoogleCloudResource extends Resource {

    private Instance instance;
    private Storage storage;

    public GoogleCloudResource(Instance instance, Storage storage) {
        this.instance = instance;
        this.storage = storage;
    }

    public Instance getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return String.format("Google Instance with capacity : %s and storage : %s", instance , storage);
    }
}

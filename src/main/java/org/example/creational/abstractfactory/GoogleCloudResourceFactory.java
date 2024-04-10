package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.instance.GoogleComputeEngineInstance;
import org.example.creational.abstractfactory.instance.Instance;
import org.example.creational.abstractfactory.resource.GoogleCloudResource;
import org.example.creational.abstractfactory.storage.GoogleCloudStorage;

public class GoogleCloudResourceFactory extends ResourceFactory {

    @Override
    protected GoogleComputeEngineInstance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance();
    }

    @Override
    protected GoogleCloudStorage createStorage(Integer storageMib) {
        return new GoogleCloudStorage(storageMib);
    }

    @Override
    public GoogleCloudResource generateResource(Instance.Capacity capacity, int storageMib) {
        GoogleComputeEngineInstance instance = createInstance(capacity);
        GoogleCloudStorage storage = createStorage(storageMib);
        instance.attachStorage(storage);
        return new GoogleCloudResource(instance, storage);
    }
}

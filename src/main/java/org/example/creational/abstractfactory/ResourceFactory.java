package org.example.creational.abstractfactory;
import org.example.creational.abstractfactory.instance.Instance;
import org.example.creational.abstractfactory.resource.Resource;
import org.example.creational.abstractfactory.storage.Storage;

public abstract class ResourceFactory {

    protected abstract Instance createInstance(Instance.Capacity capacity);

    protected abstract Storage createStorage(Integer storageMib);

    public abstract Resource generateResource(Instance.Capacity capacity, int storageMib);
}

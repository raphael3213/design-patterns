package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.instance.Instance;
import org.example.creational.abstractfactory.resource.Resource;

public class Main {
    public static void main(String[] args) {
        ResourceFactory factory = new GoogleCloudResourceFactory();

        Resource resource = factory.generateResource(Instance.Capacity.large, 10);

        resource.getInstance().start();
        resource.getInstance().stop();


        System.out.println(resource);
    }
}

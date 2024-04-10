package org.example.creational.abstractfactory.instance;

import org.example.creational.abstractfactory.storage.Storage;

public class GoogleComputeEngineInstance extends Instance {

    @Override
    public void start() {
        System.out.println("Google Compute Engine instance started");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine instance stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Google Cloud Storage attached to Google Compute Engine instance");
    }


}
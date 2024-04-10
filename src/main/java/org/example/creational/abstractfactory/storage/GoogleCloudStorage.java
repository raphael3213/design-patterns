package org.example.creational.abstractfactory.storage;

public class GoogleCloudStorage extends Storage{

    public GoogleCloudStorage(int Mib) {
        super(Mib);
    }

    @Override
    protected String getId() {
        return "";
    }
}

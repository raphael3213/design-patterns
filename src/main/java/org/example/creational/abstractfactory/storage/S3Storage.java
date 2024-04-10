package org.example.creational.abstractfactory.storage;

public class S3Storage extends Storage{
    public S3Storage(int Mib) {
        super(Mib);
    }

    @Override
    protected String getId() {
        return "";
    }
}

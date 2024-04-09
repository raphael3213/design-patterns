package org.example.creational.factory.message;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{abc}";
    }
}
package org.example.creational.factory;

import org.example.creational.factory.message.JSONMessage;
import org.example.creational.factory.message.Message;

public class JSONMessageFactory extends MessageFactory {
    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
}

package org.example.creational.factory;

import org.example.creational.factory.message.Message;
import org.example.creational.factory.message.TextMessage;

public class TextMessageFactory extends MessageFactory {
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}

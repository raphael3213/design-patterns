package org.example.creational.factory;

import org.example.creational.factory.message.Message;

public abstract class MessageFactory {

    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }


    protected abstract Message createMessage();
}

package org.example.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

import java.util.Base64;

public class Base64MessageDecorator implements MessageComponent {

    public Base64MessageDecorator(MessageComponent messageComponent) {
        this.messageComponent = messageComponent;
    }

    private final MessageComponent messageComponent;


    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(messageComponent.getContent().getBytes());
    }
}

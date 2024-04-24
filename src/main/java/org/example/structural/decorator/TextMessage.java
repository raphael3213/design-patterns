package org.example.structural.decorator;

public class TextMessage implements MessageComponent {

    public TextMessage(String message) {
        this.message = message;
    }

    private final String message;


    @Override
    public String getContent() {
        return this.message;
    }
}

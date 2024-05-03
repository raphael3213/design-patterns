package org.example.structural.flyweight;

public class SystemErrorMessage implements ErrorMessageFlyWeight{

    private final String messageTemplate;
    private final String baseURL = "http://myDomain.com?error=%s";

    public SystemErrorMessage(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    @Override
    public String getErrorMessageText(String errorCode) {
        return String.format(messageTemplate , errorCode) + "   " + String.format(baseURL, errorCode);
    }
}

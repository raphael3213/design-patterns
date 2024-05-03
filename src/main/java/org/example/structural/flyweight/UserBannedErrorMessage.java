package org.example.structural.flyweight;

public class UserBannedErrorMessage implements ErrorMessageFlyWeight {

    private final String messageTemplate = " Sorry , the user is banned : %s";

    @Override
    public String getErrorMessageText(String errorCode) {
        return String.format(messageTemplate , errorCode);
    }
}

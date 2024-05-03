package org.example.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        SystemErrorMessage errorMessage = ErrorMessageFactory.getInstance().getSystemError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(errorMessage.getErrorMessageText("502"));

        UserBannedErrorMessage userBannedErrorMessage = ErrorMessageFactory.getInstance().getUserError();
        System.out.println(userBannedErrorMessage.getErrorMessageText("545"));
    }
}

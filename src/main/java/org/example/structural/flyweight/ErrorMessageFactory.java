package org.example.structural.flyweight;

import org.example.creational.builder.User;

import java.util.HashMap;

public class ErrorMessageFactory {

    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private static ErrorMessageFactory INSTANCE = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance(){
        return INSTANCE;
    }

    private HashMap<ErrorType, SystemErrorMessage> cache= new HashMap<>();

    public ErrorMessageFactory(){
        cache.put(ErrorType.GenericSystemError, new SystemErrorMessage("A generic error of type : %s has occured " ));
        cache.put(ErrorType.PageNotFoundError, new SystemErrorMessage("A page not found error of type : %s has occured " ));
        cache.put(ErrorType.ServerError, new SystemErrorMessage("A server error of type : %s has occured " ));
    }

    /**
     * This flyweight class is shared, hence we create singe instances with different extrensic states and cache them to use accross the app
     * */

    public SystemErrorMessage getSystemError(ErrorType type){
        return cache.get(type);
    }

    /**
     * This flyweight class is not shared, hence we create a new instanc with different extrensic states .
     * */
    public UserBannedErrorMessage getUserError(){
        return new UserBannedErrorMessage();
    }
}

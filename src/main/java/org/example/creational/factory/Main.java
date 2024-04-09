package org.example.creational.factory;

public class Main {


    public static void main(String[] args) {
        MessageFactory JSONFactory = new JSONMessageFactory();
        MessageFactory TextFactory = new TextMessageFactory();

        System.out.println(JSONFactory.getMessage().getContent());
        System.out.println(TextFactory.getMessage().getContent());
    }

}

package org.example.structural.decorator;

public class Main {

    public static void main(String[] args) {
        String mixedString = "This is a <b>bold</b> statement & a special character: &";
        MessageComponent message = new TextMessage(mixedString);
        String finalMessage = new Base64MessageDecorator(new HtmlEncodedMessageDecorator(message)).getContent();
        System.out.println(finalMessage);

    }

}

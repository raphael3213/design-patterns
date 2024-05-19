package org.example.behavioural.iterator;

public class Main {
    public static void main(String[] args) {

        ThemeColor.ThemeIterator iterator = ThemeColor.getIterator();

        while(iterator.hasNext()){
            System.out.println("The current color is : " + iterator.getNext().toString());
        }
    }
}

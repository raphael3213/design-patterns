package org.example.structural.proxy;

import javafx.geometry.Point2D;

public class Main {

    public static void main(String[] args) {
//        Image image = ImageFactory.getStaticProxyImage("A1.bmp");

//        image.setLocation(new Point2D(10,10));
//        System.out.println("Image Location : " + image.getLocation());
//
//        image.render();

        Image dynamicImage = ImageFactory.getDynamicProxyImage("B1.bmp");
        dynamicImage.setLocation(new Point2D(10,10));
        dynamicImage.render();
    }
}

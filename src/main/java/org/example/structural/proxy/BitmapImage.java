package org.example.structural.proxy;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private final String name;

    public BitmapImage(String filename){
        System.out.println("loaded from disk : " + filename);
        name = filename;
    }
    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered : " + this.name);
    }
}

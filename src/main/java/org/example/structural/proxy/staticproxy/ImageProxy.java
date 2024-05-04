package org.example.structural.proxy.staticproxy;

import javafx.geometry.Point2D;
import org.example.structural.proxy.BitmapImage;
import org.example.structural.proxy.Image;

public class ImageProxy implements Image {

    private BitmapImage image;

    private Point2D location;
    private String fileName;

    public ImageProxy(String name){
        this.fileName = name;
    }
    @Override
    public void setLocation(Point2D point2D) {
        if(image == null){
            location = point2D;
            return;
        }

        image.setLocation(point2D);
    }

    @Override
    public Point2D getLocation() {
        if(image == null){

            return location;
        }


        return image.getLocation();
    }

    @Override
    public void render() {
        if(image == null){
            image = new BitmapImage(this.fileName);
            if(location != null){
                image.setLocation(location);
            }
        }

        image.render();
    }
}

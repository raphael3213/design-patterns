package org.example.structural.proxy.dynamicproxy;

import javafx.geometry.Point2D;
import org.example.structural.proxy.BitmapImage;
import org.example.structural.proxy.Image;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {


    private String fileName;
    private Point2D location;
    private BitmapImage image;
    private static final Method setLocation;
    private static final Method getLocation;
    private static final Method render;
    static {

        try {
            setLocation = Image.class.getMethod("setLocation", new Class[]{Point2D.class});
            getLocation = Image.class.getMethod("getLocation");
            render = Image.class.getMethod("render");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
    public ImageInvocationHandler(String fileName){
        this.fileName = fileName;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {



        if(setLocation.equals(method)){
            return handleSetLocation(args);

        }
        else if(getLocation.equals(method)){
            return handleGetLocation();

        }
        else if(render.equals(method)){
            return handleRender();
        }
        else{
            return null;

        }
    }

    private Object handleRender() {
        if(image == null){
            image = new BitmapImage(this.fileName);
            if(location != null){
                image.setLocation(location);
            }
        }
        image.render();

        return null;
    }

    private Point2D handleGetLocation() {
        if(image == null){

            return location;
        }

        return image.getLocation();
    }

    private Object handleSetLocation(Object[] args) {

        if(image == null){
            location = (Point2D) args[0];
        }
        else{
            image.setLocation((Point2D) args[0]);
        }


        return null;
    }
}

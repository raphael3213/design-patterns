package org.example.structural.proxy;

import org.example.structural.proxy.dynamicproxy.ImageInvocationHandler;
import org.example.structural.proxy.staticproxy.ImageProxy;

import java.lang.reflect.Proxy;

public class ImageFactory {

    public static Image getStaticProxyImage(String fileName){

        return new ImageProxy(fileName);
    }

    public static Image getDynamicProxyImage(String fileName){

        return (Image)Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class} , new ImageInvocationHandler(fileName));
    }
}
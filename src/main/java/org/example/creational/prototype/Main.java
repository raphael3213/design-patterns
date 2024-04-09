package org.example.creational.prototype;

import javafx.geometry.Point3D;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SwordMan s1 = new SwordMan();
        s1.move(new Point3D(-10,0,0), 20f);
        s1.attack();
        System.out.println(s1);

        SwordMan s2 = (SwordMan) s1.clone();

        System.out.println(s2);
    }
}

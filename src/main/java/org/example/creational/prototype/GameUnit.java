package org.example.creational.prototype;

import java.awt.geom.Point2D;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable{

    protected static enum UnitState{
        IDLE, ATTACKING
    }

    public Point3D getPosition() {
        return position;
    }

    private Point3D position;

    public GameUnit(){
        position = Point3D.ZERO;
    }

    public GameUnit(Float x, Float y, Float z){
        position = new Point3D(x,y,z);
    }



    public void move(Point3D direction , Float distance){
        Point3D finalMove = direction.normalize().multiply(distance);
        this.position = this.position.add(finalMove);
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException {

            GameUnit clone = (GameUnit) super.clone(); // This uses the clone method of the Object Class which produces a shallow copy.
            clone.initialize();
            return clone;

    }

    protected void initialize(){
        this.position = Point3D.ZERO;
        this.reset();
    }

    protected abstract void reset();
}

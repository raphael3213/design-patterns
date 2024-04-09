package org.example.creational.prototype;

public class General extends GameUnit{

    @Override
    public General clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Generals are unique");
    }
    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset Not Supported");
    }
}

package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double height, double width, double length){
       super(width,length);
       setHeight(height);
    }
    public double getHeight(){return height;}
    public double getVolume(){return this.height*this.getArea();}
    public void setHeight(double heg){
        this.height=heg<0 ? 0:heg;
    }
}

package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double heigth;

    public Cuboid(double heigth, double width, double length){
       super(width,length);
       setHeigth(heigth);
    }
    public double getHeigth(){return heigth;}
    public double getVolume(){return this.heigth*this.getArea();}
    public void setHeigth(double heg){
        this.heigth=heg<0 ? 0:heg;
    }
}

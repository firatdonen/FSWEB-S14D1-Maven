package com.workintech.cylinder;

public class Cylinder extends Circle{
    private double height;


    //constructor
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0; }
        else {
            this.height = height; }
    }

    //getHeight
    public double getHeight(){
        return height;
    }
    //getVolume(hacim)
    public double getVolume(){
       double v= getArea()*getHeight();
       return v;
    }
}

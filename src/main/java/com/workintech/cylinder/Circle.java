package com.workintech.cylinder;

    public class Circle {
    private double radius;

    //constructor
    public Circle(double radius){
        if(radius<0){this.radius=0;}else this.radius=radius;

    }
    //getRadius method
    public double getRadius(){
        return radius;
    }
    //getArea method
    public double getArea(){
        return radius*radius*Math.PI;
    }

}

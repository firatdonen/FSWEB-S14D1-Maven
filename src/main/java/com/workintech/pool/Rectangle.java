package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width , double length){
        setWidth(width);
        setLength(length);
    }

    public double getWidth(){return width;}
    public double getLength(){return length;}
    public double getArea(){return this.width*this.length;}

    public void setWidth(double widt){
        this.width=widt<0?0:widt;

    }
    public void setLength(double leng){
        this.length=leng<0?0:leng;
    }




}

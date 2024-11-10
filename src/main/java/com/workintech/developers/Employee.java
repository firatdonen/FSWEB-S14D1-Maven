package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary){}
    public long getId(){
        return id;
    }
    public String getName(){
        return name;

    }    public double getSalary(){
        return salary;
    }
    public void setId(){}
    public void setName(){}
    public void setSalary(){}

    //method
    public void work(){
        System.out.println("Employee starts to working");
    }
}

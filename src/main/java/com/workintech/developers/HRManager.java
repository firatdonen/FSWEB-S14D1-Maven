package com.workintech.developers;

public class HRManager extends Employee {

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HRManager maaşı= "+getSalary()*2);
    }
    //method

    public void addEmployee(){

    }
   }



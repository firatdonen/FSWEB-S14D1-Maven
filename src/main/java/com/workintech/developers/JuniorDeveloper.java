package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id,String name, double salary){
        super(id,name, salary);
    }
     @Override
    public void work(){//ben bunu kaldırırsam parent dekli default
        // mesajı bastırır bunun **Employee starts to working
       System.out.println(getName()+ "junior developer starts to  working...");
    }
}
 // alt insert
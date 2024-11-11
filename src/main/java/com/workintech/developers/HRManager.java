package com.workintech.developers;
import java.util.Arrays;


public class HRManager extends Employee {
    private  JuniorDeveloper[] juniorDevelopers;
    private  MidDeveloper[] midDevelopers;
    private  SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);

    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary); //changing
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }





    @Override
    public void work(){
        System.out.println(getName()+"hr manager starts to working...");
    }

    //                     (.....index.......tür.............deger........)
    public void  addEmployee(int index, JuniorDeveloper juniorDeveloper){
        try {
            if(juniorDevelopers[index]==null){
                juniorDevelopers[index]=juniorDeveloper;
            }else{
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();//olursa hangi index de hata olduğunu anlamak için
            System.out.println("index not foud:"+ index);
        }

    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();//olursa hangi index de hata olduğunu anlamak için
            System.out.println("index not foud:" + index);
        }


    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("index is full some record  exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found" + index);
        }

    }

    public String toString() {
        return "HRManager{" +
                "juniorDeveloper" + Arrays.toString(juniorDevelopers) +
                "midDeveloper" + Arrays.toString(midDevelopers) +
                "seniorDeveloper" + Arrays.toString(seniorDevelopers) +
                "}";


    }


}




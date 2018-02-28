package com.denglei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author denglei
 * Created by Administrator on 2018/1/4.
 */
public class Demo2 {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Clerk clerk = new Clerk("john",20,111.5f);
        Clerk clerk1 = new Clerk("tom",20,344.87f);
        arr.add(clerk);
        arr.add(clerk1);
        arr.add(clerk1);
        System.out.println(arr.size());
        Clerk temp = (Clerk)arr.get(0);
        arr.remove(1);
        for (int i=0;i<arr.size();i++){

            Clerk temp1 = (Clerk)arr.get(i);
            System.out.println(temp1.getName()+i);
        }

    }
}

class Clerk{

    private String name;
    private float salary;
    private int age;

    Clerk(String name,int age,float salary){

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

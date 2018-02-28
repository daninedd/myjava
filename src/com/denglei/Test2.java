package com.denglei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/28.
 */
public class Test2 {
    public static void main(String[] args) {

        Dog dogs[] = new Dog[4];

        dogs[0] = new Dog();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            float all_age = 0f;
            for(int i=0;i<4;i++){

                dogs[i] = new Dog();
                System.out.println("第"+(i+1)+"只狗名");
                String name = br.readLine();
                dogs[i].setName(name);

                System.out.println("第"+(i+1)+"只狗年龄");
                String age = br.readLine();
                float a_age = Float.parseFloat(age);
                dogs[i].setAge(a_age);

                all_age += a_age;
            }

            float avg_age = all_age/dogs.length;
            System.out.println("平均年龄为"+avg_age);

            float maxage = dogs[0].getAge();
            int maxindex = 0;

            for (int i=1;i<dogs.length;i++){

                if(maxage < dogs[i].getAge()){

                    maxage = dogs[i].getAge();
                    maxindex = i;
                }
            }

            System.out.println("the max is"+maxage+"dogis"+dogs[maxindex].getName());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Dog{

    float age;
    String name;

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

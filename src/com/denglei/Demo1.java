package com.denglei;

import java.util.Calendar;

/**
 * Created by Administrator on 2018/1/2.
 */
public class Demo1 {

    public static void main(String[] args) {

        int length = 100000;
        int[] arr = new int[length];
//        Bubble b = new Bubble();
//        Select s = new Select();
        Insert is = new Insert();

        Calendar calendar = Calendar.getInstance();

        for (int i=0;i<arr.length;i++){

            int num = (int)(Math.random()*10000);

            arr[i] = num;
        }

        System.out.println("First:"+calendar.getTime());
        is.sort(arr);
        calendar = Calendar.getInstance();
        System.out.println("Second"+calendar.getTime());
    }
}

class Bubble{

    public void sort(int arr[]){

        int temp;
        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr.length-1-i;j++){

                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

}

//选择排序法
class Select{

    public void sort(int arr[]){

        int temp = 0;
        for (int i=0;i<arr.length-1;i++){

            int min = arr[i];
            int min_index = i;

            for(int j=i+1;j<arr.length;j++){

                if(min>arr[j]){

                    min = arr[j];
                    min_index = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}

//插入排序法
class Insert{

    public void sort(int arr[]){

        for (int i=1;i<arr.length;i++){

            int insertval = arr[i];

            int index = i-1;

            while(index>=0 && insertval<arr[index]){

                arr[index+1] = arr[index];
                index--;
            }

            arr[index+1] = insertval;
        }

    }
}

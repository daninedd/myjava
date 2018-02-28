package com.denglei;

/**
 * @author denglei
 * 约瑟夫环
 * Created by Administrator on 2017/12/20.
 */
public class Test {

    public static void main(String[] args) {

        CycleLink c = new CycleLink();
        c.setLen(5);//5个人
        c.createLink();
        c.setK(2);
        c.setM(2);
        c.play();
    }

}
class Child{

    int no;
    Child nextchild = null;

    public Child(int no){
        this.no = no;
    }
}
class CycleLink{

    //共有几个节点
    int len = 0;
    //第一个节点
    Child first = null;
    //指针
    Child temp = null;
    //上一个指针
    Child lasttemp = null;
    //从第几个开始数
    int k;
    public void setK(int k){
        this.k = k;
    }
    //数几次
    int m;
    public void setM(int m){
        this.m = m;
    }

    public void setLen(int len){
        this.len = len;
    }

    //创建链表
    public void createLink(){

        for (int i=1;i<=len;i++){

            if(i == 1){
                Child ch = new Child(i);
                this.first = ch;
                this.temp = ch;
            }else{

                if(i==len){
                    Child ch = new Child(i);
                    temp.nextchild = ch;
                    temp = ch;
                    temp.nextchild = this.first;

                }else{

                    Child ch = new Child(i);
                    temp.nextchild = ch;
                    temp = ch;
                }
            }
        }
    }

    //构成新的链表
    public void play(){

        Child temp = this.first;
        for (int i=1;i<k;i++){
            temp = temp.nextchild;
        }

        while (this.len!=1){
            for (int j=1;j<m;j++){
                temp = temp.nextchild;

            }
            Child temp2 = temp;

            while (temp2.nextchild!=temp){

                temp2 = temp2.nextchild;
            }

            System.out.println("出圈的人"+temp.no);
            temp2.nextchild = temp.nextchild;
            temp = temp.nextchild;
            this.len--;

        }
        System.out.println(temp.no);
    }

    public void show(){

        Child temp = this.first;
        do{
            System.out.println(temp.no);
            temp = temp.nextchild;
        }while (temp!=this.first);
    }
}


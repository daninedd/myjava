package com.denglei;

import java.util.ArrayList;

/**@author de
 * Created by Administrator on 2018/1/16.
 */
public class Demo3 {
    public static void main(String[] args) {

        EmpManage em = new EmpManage();
        Emp zlf = new Emp("zlf",20,35.5f,"1");
        Emp jyh = new Emp("jyh",18,38.5f,"2");
        em.addEmp(zlf);
        em.addEmp(jyh);
        em.showInfo("1");
    }
}

class EmpManage{

    private ArrayList al = null;
    public EmpManage(){
        al = new ArrayList();
    }
    public void addEmp(Emp emp){

        //asdkslhf
        al.add(emp);
    }

    public void showInfo(String empNo){

        for (int i=0;i<al.size();i++){

            Emp emp = (Emp)al.get(i);

            if(emp.getNo().equals(empNo)){

                System.out.println("编号为"+empNo);
            }

        }
    }

    public void update(String no,float sal){

        for (int i=0;i<al.size();i++){

            Emp emp = (Emp) al.get(i);
            if(emp.getNo().equals(no)){

                emp.setSalar(sal);
            }
        }
    }


}
class Emp{

    private String name;
    private int age;
    private float salar;
    private String no;

    Emp(String name, int age, float salar, String no){

        this.setName(name);
        this.setAge(age);
        this.setSalar(salar);
        this.setNo(no);


    }
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalar() {
        return salar;
    }

    public void setSalar(float salar) {
        this.salar = salar;
    }
}

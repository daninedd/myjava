package com.denglei;

/**
 * @author denglei
 * @version 1.0
 * Created by Administrator on 2017/12/27.
 */
public class Test1 {
    public static void main(String[] args) {

        CarShop ashop = new CarShop();
        ashop.sellCar(new Bmw());
        ashop.sellCar(new Qq());
        System.out.println("总计"+ashop.getTotalMoney());
    }
}

interface Car{

    //汽车名称
    String getName();

    //汽车售价
    int getPrice();

}

class Bmw implements Car {

    @Override
    public String getName() {
        return "宝马";
    }

    @Override
    public int getPrice() {
        return 300000;
    }
}

class Qq implements Car{

    @Override
    public String getName() {
        return "奇瑞QQ";
    }

    @Override
    public int getPrice() {
        return 59990;
    }
}

class CarShop{

    private int totalmoney = 0;

    public void sellCar(Car car){

        System.out.println("车型为"+car.getName()+"卖出了"+car.getPrice()+"元");

        totalmoney += car.getPrice();
    }

    public int getTotalMoney(){

        return totalmoney;
    }


}
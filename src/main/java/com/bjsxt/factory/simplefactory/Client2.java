package com.bjsxt.factory.simplefactory;

/**
 * 利用工厂模式
 * @author lvyelanshan
 * @create 2019-11-06 15:47
 */
public class Client2 {
    public static void main(String[] args) {
        Car ad = CarFactory.CreateCar("奥迪");
        Car byd = CarFactory.CreateCar("比亚迪");

        ad.run();
        byd.run();
    }
}

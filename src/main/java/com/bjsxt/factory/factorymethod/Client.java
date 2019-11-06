package com.bjsxt.factory.factorymethod;

/**
 * @author lvyelanshan
 * @create 2019-11-06 16:05
 */
public class Client {
    public static void main(String[] args) {
        //通过奥迪工厂创建Audi对象
        Car c1 = new AudiFactory().createCar();
        //通过比亚迪工厂创建比亚迪对象
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }
}

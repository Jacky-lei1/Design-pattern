package com.bjsxt.decorator;

/**
 * @author lvyelanshan
 * @create 2019-11-07 14:26
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的飞行功能");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的水上跑的功能");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行，水里游-----");
        WaterCar waterCar1 = new WaterCar(new FlyCar(car));
        waterCar.move();
    }
}

package com.bjsxt.factory.factorymethod;

/**
 * 比亚迪工厂
 * @author lvyelanshan
 * @create 2019-11-06 16:04
 */
public class BydFactory implements CarFactory {
    public Car createCar() {
        return new Byd();
    }
}

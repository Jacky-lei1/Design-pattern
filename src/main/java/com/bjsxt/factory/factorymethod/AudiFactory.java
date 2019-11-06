package com.bjsxt.factory.factorymethod;

/**
 * 奥迪工厂
 * @author lvyelanshan
 * @create 2019-11-06 16:03
 */
public class AudiFactory implements CarFactory {
    public Car createCar() {
        return new Aodi();
    }
}

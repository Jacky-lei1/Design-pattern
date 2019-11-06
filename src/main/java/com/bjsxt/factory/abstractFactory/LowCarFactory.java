package com.bjsxt.factory.abstractFactory;

/**
 * 创建低端工厂
 * @author lvyelanshan
 * @create 2019-11-06 16:49
 */
public class LowCarFactory implements CarFactory{

    public Engine createEngine() {
        return new LowEngine();
    }

    public Seat createSeat() {
        return new LowSeat();
    }

    public Tyre createTyre() {
        return new LowTypr();
    }
}

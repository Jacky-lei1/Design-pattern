package com.bjsxt.factory.abstractFactory;

/**
 * 创建高端工厂
 * @author lvyelanshan
 * @create 2019-11-06 16:47
 */
public class LuxuryCarFactory implements CarFactory {
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Seat createSeat() {
        return new LuxurySeat();
    }

    public Tyre createTyre() {
        return new LuxuryTypr();
    }
}

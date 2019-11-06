package com.bjsxt.factory.abstractFactory;

/**
 * @author lvyelanshan
 * @create 2019-11-06 16:45
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();

}


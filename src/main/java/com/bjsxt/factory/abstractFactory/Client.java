package com.bjsxt.factory.abstractFactory;

/**
 * @author lvyelanshan
 * @create 2019-11-06 16:50
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
    }
}

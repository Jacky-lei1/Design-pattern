package com.bjsxt.factory.simplefactory;

/**
 * 测试不用工厂模式
 * @author lvyelanshan
 * @create 2019-11-06 15:40
 */
public class Client {
    public static void main(String[] args) {
        Car ad = new Aodi();
        Car byd = new Byd();

        ad.run();
        byd.run();
    }
}

package com.bjsxt.factory.abstractFactory;

/**
 * @author lvyelanshan
 * @create 2019-11-06 16:37
 */
public interface Engine {
    void run();
    void start();
}

/**
 * 好发动机
 */
class LuxuryEngine implements Engine{


    public void run() {
        System.out.println("转得快");
    }

    public void start() {
        System.out.println("启动快，可以自动启停！");
    }
}

/**
 * 好发动机
 */
class LowEngine implements Engine{


    public void run() {
        System.out.println("转得慢");
    }

    public void start() {
        System.out.println("启动慢");
    }
}



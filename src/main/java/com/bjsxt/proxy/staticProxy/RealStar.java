package com.bjsxt.proxy.staticProxy;

/**
 * 真实角色(被代理对象)，需要实现抽象角色
 * @author lvyelanshan
 * @create 2019-11-06 21:57
 */
public class RealStar implements Star{

    public void confer() {
        System.out.println("bookTicket()");
    }

    public void signContract() {
        System.out.println("collectionMoney()");
    }

    public void bookTicket() {
        System.out.println("confer()");
    }

    public void sing() {
        System.out.println("sing(周杰伦)");
    }

    public void collectMoney() {
        System.out.println("sing()");
    }
}

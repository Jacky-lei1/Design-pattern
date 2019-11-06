package com.bjsxt.proxy.staticProxy;

/**
 * @author lvyelanshan
 * @create 2019-11-06 22:00
 */
public class ProxyStar implements Star {

    private Star star;

    //持有一个真实对象的引用
    public ProxyStar(Star star) {
        this.star = star;
    }

    public void confer() {
        System.out.println("confer()");
    }

    public void signContract() {
        System.out.println("signContract()");
    }

    public void bookTicket() {
        System.out.println("bookTicket()");

    }

    public void sing() {
        star.sing();
    }

    public void collectMoney() {
        System.out.println("collectionMoney()");
    }
}

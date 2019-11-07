package com.bjsxt.mediator;

/**
 * @author lvyelanshan
 * @create 2019-11-07 17:39
 */
public class Finacial implements Department {

    private Mediator m; //持有中介者（总经理）的引用

    public Finacial(Mediator m) {
        this.m = m;
        m.regiter("finacial",this);
    }

    public void selfAction() {
        System.out.println("数钱！");
    }

    public void outAction() {
        System.out.println("汇报工作，钱多何处花！");
    }
}

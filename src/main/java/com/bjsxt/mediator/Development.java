package com.bjsxt.mediator;

/**
 * 研发部
 * @author lvyelanshan
 * @create 2019-11-07 17:36
 */
public class Development implements Department {

    private Mediator m; //持有中介者（总经理）的引用

    public Development(Mediator m) {
        this.m = m;
        m.regiter("development",this);
    }

    public void selfAction() {
        System.out.println("专心科研，开发项目");
    }

    public void outAction() {
        System.out.println("汇报工作，没钱了，需要资金安排！");

    }
}

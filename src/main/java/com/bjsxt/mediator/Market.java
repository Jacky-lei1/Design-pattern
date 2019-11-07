package com.bjsxt.mediator;

/**
 * @author lvyelanshan
 * @create 2019-11-07 17:42
 */
public class Market implements Department{

    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.regiter("market",this);
    }

    public void selfAction(){
        System.out.println("跑去接项目");
    }

    public void outAction() {
        System.out.println("汇报工作，项目承接的进度，需要资金支持！");
        m.command("finacial");
    }
}

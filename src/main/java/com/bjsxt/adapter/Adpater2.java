package com.bjsxt.adapter;

/**
 * 对象适配器，使用了组合的方式跟被适配的对象整合
 * @author lvyelanshan
 * @create 2019-11-06 21:17
 */
public class Adpater2  implements Target{

    private Adpatee adpatee;
    public void handleRep() {
        adpatee.request();
    }

    public Adpater2(Adpatee adpatee) {
        this.adpatee = adpatee;
    }
}

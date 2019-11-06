package com.bjsxt.factory.abstractFactory;

/**
 * @author lvyelanshan
 * @create 2019-11-06 16:43
 */
public interface Tyre {
    void resolve();

}

class LuxuryTypr implements Tyre{


    public void resolve() {
        System.out.println("旋转不磨损！");
    }
}
class LowTypr implements Tyre{

    public void resolve() {
        System.out.println("旋转磨损快！");
    }
}

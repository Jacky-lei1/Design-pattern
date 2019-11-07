package com.bjsxt.strategy;

/**
 * 老用户小批量
 * @author lvyelanshan
 * @create 2019-11-07 20:38
 */
public class OldCustomerFewStrategy implements Strategy {

    public double getPrice(double standardPrice) {
        //普通用户小批量，不打折，原价
        System.out.println("打八五折");
        return standardPrice*0.85;
    }
}

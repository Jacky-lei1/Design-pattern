package com.bjsxt.strategy;

/**
 * @author lvyelanshan
 * @create 2019-11-07 20:38
 */
public class NewCustomerFewStrategy implements Strategy {

    public double getPrice(double standardPrice) {
        //普通用户小批量，不打折，原价
        System.out.println("不打折，原价！");
        return standardPrice;
    }
}

package com.bjsxt.strategy;

/**
 * 普通用户大批量
 * @author lvyelanshan
 * @create 2019-11-07 20:38
 */
public class NewCustomerManyStrategy implements Strategy {

    public double getPrice(double standardPrice) {
        //普通用户小批量，不打折，原价
        System.out.println("打九折");
        return standardPrice*0.9;
    }
}

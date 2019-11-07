package com.bjsxt.strategy;

/**
 * @author lvyelanshan
 * @create 2019-11-07 20:49
 */
public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustomerFewStrategy();
        Context ctx = new Context(s1);//通过上面这个对象来算报价

        ctx.printPrice(998);
    }
}

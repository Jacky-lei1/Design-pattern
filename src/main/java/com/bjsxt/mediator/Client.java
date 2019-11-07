package com.bjsxt.mediator;

/**
 * @author lvyelanshan
 * @create 2019-11-07 17:47
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Department devp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();

    }
}

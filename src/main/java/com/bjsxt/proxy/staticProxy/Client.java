package com.bjsxt.proxy.staticProxy;

/**
 * @author lvyelanshan
 * @create 2019-11-06 22:15
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        /*代理了上面的real*/
        Star proxy = new ProxyStar(real);

        proxy.collectMoney();
        proxy.sing();
        proxy.bookTicket();
        proxy.signContract();


    }
}

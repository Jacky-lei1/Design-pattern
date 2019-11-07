package com.bjsxt.proxy.staticProxy;

/**
 * 客户端实现
 * @author lvyelanshan
 * @create 2019-11-06 22:15
 */
public class Client {
    public static void main(String[] args) {
        /*创建了一个被代理角色的对象*/
        Star real = new RealStar();
        /*代理了上面的real*/
        Star proxy = new ProxyStar(real);

        proxy.collectMoney();
        proxy.sing();
        proxy.bookTicket();
        proxy.signContract();


    }
}

package com.bjsxt.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author lvyelanshan
 * @create 2019-11-07 9:52
 */
public class Client {
    public static void main(String[] args) {
        Star realStar =  new RealStar();

        StarHandler handler = new StarHandler(realStar);

        /*通过类加载器动态生成代理类对象*/
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

        proxy.bookTicket();
        proxy.sing();

    }
}

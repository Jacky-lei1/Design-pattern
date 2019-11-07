package com.bjsxt.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 处理器接口，处理真实角色
 * @author lvyelanshan
 * @create 2019-11-07 9:48
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    /**
     * 利用反射动态生成代理类对象
     * @param proxy：代理类
     * @param method：正在调用的方法
     * @param args：方法中的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("真正的方法执行前");
        System.out.println("执行前方法。。。。。。");
        //激活真实角色中的方法
        Object invoke = method.invoke(realStar, args);

        System.out.println("真正方法执行后");
        System.out.println("执行后方法。。。。。。");
        return invoke;
    }
}

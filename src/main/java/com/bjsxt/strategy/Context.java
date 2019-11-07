package com.bjsxt.strategy;

/**
 * 负责和具体的策略类交换
 * 这样的话，算法就和客户端分离了，使得算法可以独立于客户端独立的变化
 * 如果使用spring的依赖注入功能，还可以通过配置文件，动态的注入不同的策略对象，动态的切换不同的算法
 * @author lvyelanshan
 * @create 2019-11-07 20:42
 */
public class Context {
    private Strategy strategy; //当前采用的算法对象

    //可以通过构造器来注入

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //也可以通过set方法来注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s){
        System.out.println("您该报价："+strategy.getPrice(s));
    }
}

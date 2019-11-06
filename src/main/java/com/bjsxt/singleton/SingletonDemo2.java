package com.bjsxt.singleton;

/**
 * 测试懒汉式单例模式
 * @author lvyelanshan
 * @create 2019-10-29 14:48
 */
public class SingletonDemo2 {

    //1、私有化构造器
    private SingletonDemo2(){

    }
    //2、类初始化时。不初始化这个对象(延时加载，真正用的时候再创建)
    private static SingletonDemo2 s;

    //方法同步，调用效率低，如果没有同步的话，当两个线程同时调用这个方法时，
    // 就可能出现创建两个不同的对象
    public static synchronized SingletonDemo2 getInstance(){
        if(s==null){
            s = new SingletonDemo2();
        }
            return s;

    }
}

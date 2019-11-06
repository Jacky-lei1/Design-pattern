package com.bjsxt.singleton;

/**
 * 测试饿汉式单例模式
 * @author lvyelanshan
 * @create 2019-10-29 14:48
 */
public class SingletonDemo1 {

    //1、构造器私有
    private SingletonDemo1(){

    }

    //2、创建对象,类初始化时,立即加载这个对象(没有延时加载的优势)，加载类时，天然是线程安全的。
    private static SingletonDemo1 instance = new SingletonDemo1();

    //3、创建一个方法用于其他类调用这个对象(方法没有同步，调用效率高)
    public static SingletonDemo1 getInstance(){
        //直接返回这个类内部类初始化时所创建的对象
        return instance;
    }

}

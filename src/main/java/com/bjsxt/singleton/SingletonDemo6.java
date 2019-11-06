package com.bjsxt.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式(如何防止反射和反序列化漏洞)
 * @author lvyelanshan
 * @create 2019-10-29 14:48
 */
public class SingletonDemo6 implements Serializable {


    //2、类初始化时。不初始化这个对象(延时加载，真正用的时候再创建)
    private static SingletonDemo6 s;


    //1、私有化构造器
    private SingletonDemo6(){
        //防止其他类通过反射调用私有的的构造方法创建出第二个对象
        if(s!=null){
            //因为每次创建对象的时候都会调用构造方法，这里进行判断，只能创建一次对象，否则抛出运行异常
            throw new RuntimeException();
        }
    }


    //方法同步，调用效率低，如果没有同步的话，当两个线程同时调用这个方法时，
    // 就可能出现创建两个不同的对象
    public static synchronized SingletonDemo6 getInstance(){
        if(s==null){
            s = new SingletonDemo6();
        }
            return s;

    }

    //反序列化时，如果定义了readResolve()方法，则直接调用这个方法，返回指定对象，而不需要返回一个新的对象
    private Object readResolve() throws ObjectStreamException{
        return s;
    }
}

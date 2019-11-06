package com.bjsxt.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试反射的方式破解构造器私有
 * @author lvyelanshan
 * @create 2019-11-06 14:15
 */
public class Client2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonDemo6 s1 =  SingletonDemo6.getInstance();
        SingletonDemo6 s2 =  SingletonDemo6.getInstance();

        System.out.println(s1==s2);

        /*通过反射破解构造器私有无法在其他类中创建对象*/
        Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("com.bjsxt.singleton.SingletonDemo6");
        //获得无参构造器
        Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);//跳过权限验证，可以访问到私有的构造方法

        SingletonDemo6 s3 = c.newInstance();
        SingletonDemo6 s4 = c.newInstance();

        System.out.println(s3==s4);


    }
}

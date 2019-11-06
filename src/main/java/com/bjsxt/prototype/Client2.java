package com.bjsxt.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅复制）
 * @author lvyelanshan
 * @create 2019-11-06 19:32
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(342324324324L);
        Sheep2 s1 = new Sheep2("狗强",date);
        //克隆出来的对象和原来的对象不是同一个，但是其中的值是一样的
        Sheep2 s2 = (Sheep2) s1.clone();

        //原型对象中的值
        System.out.println("狗强一号："+s1);
        System.out.println("狗强一号："+s1.getSname());
        System.out.println("狗强一号："+s1.getBirthday());

        /*这里修改由于在sheep中也拷贝了birthday属性，所以会生成一个不同的对象
        * 拷贝时将源对象中的时间拷贝到新的时间对象中，改变原来的时间对象中的值不会影响克隆后的值*/
        date.setTime(564654654654L);

        //克隆后对象中的值
        System.out.println("狗强二号："+s2);
        System.out.println("狗强二号："+s2.getSname());
        System.out.println("狗强二号："+s2.getBirthday());

    }
}

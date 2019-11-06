package com.bjsxt.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅复制）
 * @author lvyelanshan
 * @create 2019-11-06 19:32
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date(342324324324L);
        Sheep s1 = new Sheep("狗强",date);
        //克隆出来的对象和原来的对象不是同一个，但是其中的值是一样的
        Sheep s2 = (Sheep) s1.clone();

        //原型对象中的值
        System.out.println("狗强一号："+s1);
        System.out.println("狗强一号："+s1.getSname());
        System.out.println("狗强一号："+s1.getBirthday());

        /*修改指向的时间对象中的值，由于浅复制赋值的是引用地址，所以
        * 当地址对应的值发生改变时，克隆的相应的属性中的值也发生了改变*/
        date.setTime(546546546546L);

        //克隆后对象中的值
        System.out.println("狗强二号："+s2);
        System.out.println("狗强二号："+s2.getSname());
        System.out.println("狗强二号："+s2.getBirthday());



    }
}

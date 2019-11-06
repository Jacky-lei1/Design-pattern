package com.bjsxt.prototype;

import java.io.*;
import java.util.Date;

/**
 * 测试原型模式（深复制，使用序列化和反序列化的方式实现深复制）
 * @author lvyelanshan
 * @create 2019-11-06 19:32
 */
public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Date date = new Date(342324324324L);
        Sheep s1 = new Sheep("狗强",date);
        //克隆出来的对象和原来的对象不是同一个，但是其中的值是一样的

        //原型对象中的值
        System.out.println("狗强一号："+s1);
        System.out.println("狗强一号："+s1.getSname());
        System.out.println("狗强一号："+s1.getBirthday());


        //使用序列化和反序列化实现深复制
        /*序列化*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        //通过ObjectOutputStream对象读取s1这个对象中的数据，读完之后通过bos这个流把读到的数据转换成字节数组
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        /*反序列化，反序列化的时候会将当中的属性也进行反序列化，也就是当中的date类型的属性是一个新的的date对象*/
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject(); //克隆好的对象

        System.out.println("修改原型对象的属性值");
        date.setTime(546546546546L);

        //克隆后对象中的值
        System.out.println("狗强二号："+s2);
        System.out.println("狗强二号："+s2.getSname());
        System.out.println("狗强二号："+s2.getBirthday());



    }
}

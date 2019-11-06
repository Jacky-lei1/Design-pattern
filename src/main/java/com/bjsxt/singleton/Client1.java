package com.bjsxt.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**测试通过反序列化的方式破解构造器私有
 * @author lvyelanshan
 * @create 2019-11-06 14:31
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        SingletonDemo6 s1 =  SingletonDemo6.getInstance();
        SingletonDemo6 s2 =  SingletonDemo6.getInstance();

        System.out.println(s1);

        //通过反序列化的方式构造多个对象

        /*将对象序列化保存到本地磁盘中*/
        FileOutputStream fos = new FileOutputStream("e:/a.txt");
        //对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //将对象S1写出去
        oos.writeObject(s1);
        oos.close();
        fos.close();

        /*反序列化过程*/
        //通过对象输出流输出
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
        //读取这个对象
        SingletonDemo6 s3  = (SingletonDemo6) ois.readObject();
        System.out.println(s3);


    }
}

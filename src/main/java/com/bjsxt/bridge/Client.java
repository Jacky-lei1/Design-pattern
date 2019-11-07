package com.bjsxt.bridge;

/**
 * @author lvyelanshan
 * @create 2019-11-07 11:04
 */
public class Client {
    public static void main(String[] args) {
        //销售联想的笔记本电脑，父类的引用指向子类的对象，在new子类时，调用了父类的构造器，向父类构造器中绑定一个品牌对象
        Computer2 c = new Laptop2(new Lenovo());
        //调用子类的sale()方法，同时在子类的sale方法中又调用了父类的sale方法，什么品牌就销售什么电脑，控制品牌
        //在调用子类的sale方法，控制类型
        c.sale();
    }
}

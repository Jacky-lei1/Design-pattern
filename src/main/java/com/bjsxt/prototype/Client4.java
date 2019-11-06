package com.bjsxt.prototype;

/**
 * 测试普通new方式创建对象和clone方式创建对象的效率差异
 * @author lvyelanshan
 * @create 2019-11-06 20:24
 */
public class Client4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        testNew(1000);
        testClone(1000);

    }
    //通过new的方式来获取多个对象
    public static void testNew(int size){
        long start = System.currentTimeMillis();//开始时间
        for (int i=0;i<size;i++){
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();//结束时间
        System.out.println("new的方式创建耗时："+(end-start));

    }

    //通过克隆的方式来获取对象
    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for (int i=0;i<size;i++){
            Laptop temp = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("克隆的方式创建耗时："+(end-start));

    }



}

class Laptop implements Cloneable{
    public Laptop(){
        try {
            Thread.sleep(10);//模拟创建对象耗时的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类的克隆方法，返回克隆后的对象
        Object clone = super.clone();
        return clone;
    }
}

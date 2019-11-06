package com.bjsxt.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种创建单例模式的效率
 * @author lvyelanshan
 * @create 2019-11-06 15:04
 */
public class Client3 {

    public static void main(String[] args) throws InterruptedException {

        Long start = System.currentTimeMillis();
        int threadNum = 10;
       final CountDownLatch count = new CountDownLatch(threadNum);

        //模拟测试十个线程下，每个线程同时调用十万次获取对象的方法
        for (int i=0;i<threadNum;i++) {
            new Thread(new Runnable() {
                public void run() {
                    for(int i=0;i<10000;i++){
//                        Object o = SingletonDemo4.getInstance();
                        /*测试枚举类实现单例模式的效率*/
                        Object o = SingletonDemo5.INSTANCE;
                    }
                    count.countDown();//每次执行完一个线程，计数器就减一
                }
            }).start();
        }

        //计数器线程阻塞
        count.await(); //main线程阻塞，直到计数器变为0（全部线程都执行完），才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("总耗时:"+(end-start));
    }
}

package com.bjsxt.singleton;

/**
 * 测试静态内部类实现单例模式：线程安全，调用效率高，懒加载
 * 懒加载：第一次初始化这个类的时候，并不会立即初始化它的静态内部类，只有真正去调用这个方法的时候
 * 才会去加载这个类，已经实现了延时加载。（懒加载）
 * 线程安全：因为类加载是天然线程安全的，
 * 调用效率高：这样在需要使用这个对象的时候直接调用方法即可，不需要同步等待
 * @author lvyelanshan
 * @create 2019-10-29 14:48
 */
public class SingletonDemo4 {

    //1、构造器私有
    private SingletonDemo4(){

    }
    //2、在静态内部类中创建对象
    private static class SingletonClassInstance{
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    //3、暴露一个用于获取对象的方法
    public static SingletonDemo4 getInstance(){
        //直接返回在内部类中创建的对象，这样每个线程在调用这个方法时，
        // 拿到的都是同一个对象，因此是线程安全的，不需要加上方法同步
        return SingletonClassInstance.instance;
    }


}

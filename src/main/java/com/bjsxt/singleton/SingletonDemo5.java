package com.bjsxt.singleton;

/**
 * 测试枚举式实现单例模式(没有延时加载（懒加载）的效果)
 * @author lvyelanshan
 * @create 2019-10-29 14:48
 */
public enum  SingletonDemo5 {

    //这个枚举元素，本身就是单例对象
   INSTANCE;

   //添加自己需要的操作
    public void singletonOperation(){

    }

}

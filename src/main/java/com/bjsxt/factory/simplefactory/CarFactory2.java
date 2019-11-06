package com.bjsxt.factory.simplefactory;

/**
 * 模拟工厂方法,静态工厂模式
 * @author lvyelanshan
 * @create 2019-11-06 15:44
 */
public class CarFactory2 {
   public static Car createAudi(){
       return new Aodi();
   }
   public static Car createByd(){
       return new Byd();
   }
}

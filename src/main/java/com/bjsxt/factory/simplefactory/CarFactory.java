package com.bjsxt.factory.simplefactory;

/**
 * 模拟工厂方法,简单工厂类
 * @author lvyelanshan
 * @create 2019-11-06 15:44
 */
public class CarFactory {
    public static Car CreateCar(String type){
        if("奥迪".equals(type)){
            return new Aodi();
        }else if ("比亚迪".equals(type)){
            return new Byd();
        }else{
            return null;
        }
    }
}

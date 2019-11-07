package com.bjsxt.ChessFlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * @author lvyelanshan
 * @create 2019-11-07 15:29
 */
public class ChessFlyWeightFactory {
    //享元池对象
    private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight getClass(String color){
        if (map.get(color)!=null){
            return map.get(color);
        }else {
            ChessFlyWeight cfw = new ConcretaChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}

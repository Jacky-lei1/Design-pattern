package com.bjsxt.builder;

/**
 * @author lvyelanshan
 * @create 2019-11-06 17:40
 */
public class Client {
    public static void main(String[] args) {
        /*通过装配者和和构建这创建一个飞船对象*/
        AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());

        AirShip airShip = director.createAirShip();

        System.out.println(airShip.getEngine().getName());

        airShip.launch();


    }
}

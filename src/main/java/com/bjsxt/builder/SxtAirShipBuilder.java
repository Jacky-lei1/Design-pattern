package com.bjsxt.builder;

/**
 * //StringBuilder,以后学习XML解析中，JDOM库中的类，DomBuilder,SaxBuilder
 * @author lvyelanshan
 * @create 2019-11-06 17:28
 */
public class SxtAirShipBuilder implements AirShipBuilder{

    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("神州发动机");
    }

    public OrbitalModule builerObitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("神州轨道舱");
    }

    public EscapeTower builderEscapeTower() {

        System.out.println("构建逃离塔");
        return new EscapeTower("神州逃离塔");
    }

}

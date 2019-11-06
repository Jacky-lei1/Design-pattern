package com.bjsxt.builder;

/**
 * 构建子组件
 * @author lvyelanshan
 * @create 2019-11-06 17:24
 */
public interface AirShipBuilder {
    /*提供三个方法构建子组件*/
    Engine builderEngine();
    OrbitalModule builerObitalModule();
    EscapeTower builderEscapeTower();

}

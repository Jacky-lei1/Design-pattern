package com.bjsxt.builder;

/**
 * @author lvyelanshan
 * @create 2019-11-06 17:34
 */
public class SxtAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public SxtAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    public AirShip createAirShip() {
        Engine engine = builder.builderEngine();
        OrbitalModule orbitalModule = builder.builerObitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();

        //装配飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);

        return ship;
    }
}

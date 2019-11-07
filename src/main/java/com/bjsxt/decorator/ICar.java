package com.bjsxt.decorator;

/**
 * 抽象组件
 * @author lvyelanshan
 * @create 2019-11-07 14:14
 */
public interface ICar {
    void move();

}
//ConcreateComponent:具体构建角色（真实对象）
class Car implements ICar{

    public void move() {
        System.out.println("陆地上跑");
    }
}

//装饰器角色
class SuperCar implements ICar{
    //作为装饰器需要持有真实对象的引用
    private ICar car;

    //传入的是什么car就是什么
    public SuperCar(ICar car) {
        this.car = car;
    }

    public void move() {
        car.move();
    }

}
//具体装饰对象
class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

//具体装饰对象
class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }
    public void swim(){
        System.out.println("水里游");

    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

//具体装饰对象
class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }
    public void auto(){
        System.out.println("自动跑");

    }

    @Override
    public void move() {
        super.move();
        auto();
    }
}



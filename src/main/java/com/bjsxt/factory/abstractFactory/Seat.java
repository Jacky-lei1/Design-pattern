package com.bjsxt.factory.abstractFactory;

/**
 * @author lvyelanshan
 * @create 2019-11-06 16:40
 */
public interface Seat {
    void message();

}

/**
 * 高端座椅
 */
class LuxurySeat implements Seat{

    public void message() {
        System.out.println("自动按摩");
    }
}

class LowSeat implements Seat{

    public void message() {
        System.out.println("不能自动按摩");
    }
}

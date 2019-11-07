package com.bjsxt.state;

/**
 * 空闲状态
 * @author lvyelanshan
 * @create 2019-11-07 21:14
 */
public class FreeState implements State {
    public void handle() {
        System.out.println("房间空闲，没人住");
    }
}

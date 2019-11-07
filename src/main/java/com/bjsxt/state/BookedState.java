package com.bjsxt.state;

/**
 * 已预订状态
 * @author lvyelanshan
 * @create 2019-11-07 21:15
 */
public class BookedState implements State{

    public void handle() {
        System.out.println("房间已预订！");
    }
}

package com.bjsxt.state;

/**
 * 已入住状态
 * @author lvyelanshan
 * @create 2019-11-07 21:16
 */
public class CheckedInState implements State {

    public void handle() {
        System.out.println("已入住，请勿打扰！");
    }
}

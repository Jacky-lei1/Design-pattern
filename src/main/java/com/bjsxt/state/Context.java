package com.bjsxt.state;

/**
 * 上下文类，维持不同状态之间的切换
 * 房间对象，持有不同的状态
 * @author lvyelanshan
 * @create 2019-11-07 21:17
 */
public class Context {

    //如果是银行系统，这个Context类就是账号，根据金额不同，切换不同的状态！

    private State state;

    public void setState(State s){
        System.out.println("修改状态！");
        state = s;
        state.handle();//调用这个状态对应的行为
    }
}

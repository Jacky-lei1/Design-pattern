package com.bjsxt.state;

/**
 * @author lvyelanshan
 * @create 2019-11-07 21:20
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new FreeState());//将状态设置为空闲状态
        ctx.setState(new BookedState());

    }
}

package com.bjsxt.command;

/**
 * 命令的发起者/调用者
 * @author lvyelanshan
 * @create 2019-11-07 19:58
 */
public class Invoke {
    //表示发起什么样的命令，可以发起一条或者多条命令
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    //业务方法，用于调用命令类的方法
    public void call(){
        /*执行命令*/
        command.execute();
    }
}

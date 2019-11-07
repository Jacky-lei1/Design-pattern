package com.bjsxt.command;

/**
 * 代表命令
 * @author lvyelanshan
 * @create 2019-11-07 19:54
 */
public interface Command {
    //表示执行命令的方法
    void execute();
}

/**
 * 收集命令
 */
class ConcreteCommand implements Command{

    //应该持有真正命令的引用
    private Receier receier; //命令真正的执行者

    public ConcreteCommand(Receier receier) {
        this.receier = receier;
    }

    public void execute() {
        //调用真正的执行者，这里在调用前调用后就可以进行一些处理
        receier.action();
    }
}

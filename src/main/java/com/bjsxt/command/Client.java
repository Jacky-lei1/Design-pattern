package com.bjsxt.command;

/**
 * @author lvyelanshan
 * @create 2019-11-07 20:02
 */
public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receier());
        Invoke i = new Invoke(c);
        i.call();
    }
}

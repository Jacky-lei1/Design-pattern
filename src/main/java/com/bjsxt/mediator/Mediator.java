package com.bjsxt.mediator;

/**
 * 抽象出的中介者
 * @author lvyelanshan
 * @create 2019-11-07 17:33
 */
public interface Mediator {
    void regiter(String dname,Department d);
    void command(String dename);
}

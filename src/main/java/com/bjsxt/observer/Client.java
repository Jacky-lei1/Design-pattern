package com.bjsxt.observer;

/**
 * @author lvyelanshan
 * @create 2019-11-07 22:24
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        ConcreateSubject subject = new ConcreateSubject();
        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //让这个三个观察者添加到subject对象的观察者队伍中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        //改变subject的状态
        subject.setState(3000);
        System.out.println("########");
        //看看观察者的状态是否发生了变化
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }
}

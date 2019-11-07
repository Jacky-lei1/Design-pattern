package com.bjsxt.observer;

/**
 * @author lvyelanshan
 * @create 2019-11-07 22:17
 */
public class ConcreateSubject extends Subject {
    private int state;

    public int getState(){
        return state;
    }


    public void setState(int state){
        this.state = state;
        //状态发生变化了，通知所有的观察者
        this.notifyAllObserver();
    }

}

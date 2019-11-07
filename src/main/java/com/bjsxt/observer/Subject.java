package com.bjsxt.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-07 22:12
 */
public class Subject {

    /*所有的观察者都放到这个list中*/
    protected List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }
    public void removeObserver(Observer obs){
        list.remove(obs);
    }
    //通知所有的观察者更新状态
    public void notifyAllObserver(){
        for (Observer obs:list){
            obs.update(this);
        }
    }

}

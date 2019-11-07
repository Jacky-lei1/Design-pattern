package com.bjsxt.observer;

/**
 * @author lvyelanshan
 * @create 2019-11-07 22:21
 */
public class ObserverA implements Observer {

    private int myState; //myState需要跟目标对象的state保持一致

    public void update(Subject subject) {
         myState = ((ConcreateSubject) subject).getState();
    }


    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}

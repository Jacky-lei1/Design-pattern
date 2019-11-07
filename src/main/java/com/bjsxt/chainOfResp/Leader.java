package com.bjsxt.chainOfResp;

/**
 * 抽象类
 * @author lvyelanshan
 * @create 2019-11-07 15:56
 */
public abstract class Leader {
    protected String name;//领导姓名
    protected Leader nextLeader;//责任链上的后继对象

    //是哪个领导就初始化成哪个对象
    public Leader(String name) {
        this.name = name;
    }
    //责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求的核心业务方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);

}

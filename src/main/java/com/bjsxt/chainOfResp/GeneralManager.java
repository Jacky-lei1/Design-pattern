package com.bjsxt.chainOfResp;

/**
 * 总经理
 * @author lvyelanshan
 * @create 2019-11-07 16:02
 */
public class GeneralManager extends Leader{

    public GeneralManager(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<30){//大于等于10天小于30天的总经理才有资格审批
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+"，理由"+request.getReason());
            System.out.println("总经理："+this.name+"，审批通过！");
        }else {
            System.out.println("请假这么多天？没戏！");
        }
    }
}

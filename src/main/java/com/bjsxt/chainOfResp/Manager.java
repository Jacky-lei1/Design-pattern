package com.bjsxt.chainOfResp;

/**
 * 经理
 * @author lvyelanshan
 * @create 2019-11-07 16:02
 */
public class Manager extends Leader{

    public Manager(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<10){//大于等于3天小于十天的经理才有资格审批
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+"，理由"+request.getReason());
            System.out.println("经理："+this.name+"，审批通过！");
        }else {
            if(this.nextLeader!=null){
                //大于等于十天的话交给下家审批
                this.nextLeader.handleRequest(request);
            }
        }
    }
}

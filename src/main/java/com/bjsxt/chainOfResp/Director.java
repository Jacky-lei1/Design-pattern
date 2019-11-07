package com.bjsxt.chainOfResp;

/**
 * 主任
 * @author lvyelanshan
 * @create 2019-11-07 16:02
 */
public class Director extends Leader{

    public Director(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<3){//小于3天的主任才有资格审批
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+"，理由"+request.getReason());
            System.out.println("主任："+this.name+"，审批通过！");
        }else {
            if(this.nextLeader!=null){
                //大于等于三天的话交给下家审批
                this.nextLeader.handleRequest(request);
            }
        }
    }
}

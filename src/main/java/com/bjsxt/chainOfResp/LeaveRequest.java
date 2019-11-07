package com.bjsxt.chainOfResp;

/**
 * 封装请假的基本信息(请假条)
 * @author lvyelanshan
 * @create 2019-11-07 15:54
 */
public class LeaveRequest {
    //雇员的名称
    private String empName;
    //请假的天数
    private int leaveDays;
    //请假原因
    private String reason;

    public LeaveRequest(String empName, int leaveDays, String reason) {
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

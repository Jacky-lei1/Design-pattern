package com.bjsxt.prototype;

import java.util.Date;

/**
 * @author lvyelanshan
 * @create 2019-11-06 19:28
 */
public class Sheep2 implements Cloneable {
    private String sname;
    private Date birthday;

    //重写Object类中的克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();//直接调用Object中的克隆方法

        //添加如下代码实现深复制（deep clone）
        Sheep2 s = (Sheep2) obj;
        s.birthday = (Date) this.birthday.clone();//把属性也进行克隆
        return obj;
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public Sheep2() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

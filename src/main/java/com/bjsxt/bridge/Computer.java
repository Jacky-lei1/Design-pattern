package com.bjsxt.bridge;

/**
 * 电脑接口
 * @author lvyelanshan
 * @create 2019-11-07 10:20
 */
public interface Computer {
    void sale();
}

/**
 * 销售台式机
 */
class Desktop implements Computer{

    public void sale() {
        System.out.println("销售台式机");
    }
}
/**
 * 销售笔记本
 */
class Laptop implements Computer{

    public void sale() {
        System.out.println("销售笔记本");
    }
}
/**
 * 销售平板
 */
class Pad implements Computer{

    public void sale() {
        System.out.println("销售平板");
    }
}

class lenovoDestop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}
class lenovoLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}
class lenovoPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售联想平板");
    }
}



class shengzhouDestop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售神州台式机");
    }
}
class shengzhouLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售神州笔记本");
    }
}
class shengzhouPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售神州平板");
    }
}


class dellDestop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售戴尔台式机");
    }
}
class dellLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本");
    }
}
class dellPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售戴尔平板");
    }
}






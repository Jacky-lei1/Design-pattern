package com.bjsxt.bridge;

/**
 * 电脑类型的维度
 * @author lvyelanshan
 * @create 2019-11-07 10:56
 */
public class Computer2 {
    //持有品牌对象的引用
    protected Brand brand;

    //传进来的是什么品牌就调用什么品牌的sale方法
    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }

}

class Desktop2 extends Computer2{

    //因为父类中只有一个带参数的构造方法，所以在子类中需要显示的写出来，
    // 需要传递给父类一个需要的属性，才能正确构建父类的对象
    public Desktop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}
class Laptop2 extends Computer2{

    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
class Padtop2 extends Computer2{

    public Padtop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售平板");
    }
}


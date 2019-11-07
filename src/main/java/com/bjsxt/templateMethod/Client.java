package com.bjsxt.templateMethod;

/**
 * @author lvyelanshan
 * @create 2019-11-07 20:59
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMony();//抽象类new具体实现类

        btm.process();

        //采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱！");
            }
        };
        btm2.process();

        BankTemplateMethod btm3 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要理财，我这里有三十亿人民币");
            }
        };
        btm3.process();
    }
}
class DrawMony extends BankTemplateMethod{

    public void transact() {
        System.out.println("我要取款！！");
    }
}




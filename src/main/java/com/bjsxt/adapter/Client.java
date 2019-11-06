package com.bjsxt.adapter;

/**
 * 客户端类（相当于例子中的笔记本，只有USB接口，但是需要使用其他接口的键盘）
 * @author lvyelanshan
 * @create 2019-11-06 21:13
 */
public class Client {
    /*相当于笔记本调用了USB接口*/
    public void test1(Target t){
        /*相当于笔记本电脑通过这个USB接口发起打字请求*/
        t.handleRep();
    }

    public static void main(String[] args) {
        Client c = new Client();//相当于有了一台笔记本电脑
        Adpatee adpatee = new Adpatee();//被适配的对象，相当于键盘
        /*相当于在适配器中实现了Target方法，而实现的方式是调用被适配对象（键盘）中的方法*/
//        Target t = new Adpater();//真正的适配器，接口new实现类，实现类中调用的是父类中的方法
        Target t = new Adpater2(adpatee);
        c.test1(t);
    }
}

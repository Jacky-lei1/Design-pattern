package com.bjsxt.adapter;

/**；类适配器方式实现
 * 适配器（相当于USB和ps/2转接器）
 * 需要将被适配对象和接口联系起来：相当于需要将键盘的ps/2接口通过这个转换器转接到USB接口上
 * @author lvyelanshan
 * @create 2019-11-06 21:17
 */
public class Adpater extends Adpatee implements Target{
    /*首先这个适配器本身需要自己能适配这个USB接口，所以需要实现Target接口*/
    /*其次，这个适配器还需要继承被适配的对象：键盘*/
    /*这个handleRep方法就相当于电脑需要的打字的方法（由键盘提供）*/
    public void handleRep() {
        //通过调用父类（被适配的类：键盘）中提供的打字的方法，接上电脑中需要的打字的方法实现适配
        super.request();
    }
}

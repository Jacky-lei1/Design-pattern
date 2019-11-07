package com.bjsxt.iterator;


/**
 * @author lvyelanshan
 * @create 2019-11-07 17:05
 */
public interface MyIterator {
    void first(); //将游标指向第一个元素
    void next(); //将游标指向下一个元素
    boolean hasNext(); //判断是否存在下一个元素

    boolean isFirst(); //判断是否是第一个元素
    boolean isLast(); //判断是否是最后一个元素

    Object getCurrentObj();//获取当前游标指向的对象
}

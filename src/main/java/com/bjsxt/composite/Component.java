package com.bjsxt.composite;

/**
 * 抽象组件
 * @author lvyelanshan
 * @create 2019-11-07 11:29
 */
public interface Component {
    void operation();
}
//叶子组件
interface Leaf extends Component{

}
//容器组件
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}

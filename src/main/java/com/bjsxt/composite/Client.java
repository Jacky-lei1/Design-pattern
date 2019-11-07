package com.bjsxt.composite;

/**
 * @author lvyelanshan
 * @create 2019-11-07 12:22
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f1,f2,f3,f4,f5;
        f1 = new Folder("我的收藏");
        f2 = new ImageFile("架构师刘再强的大头像.jpg");
        f3 = new TextFile("Hello.txt");
        //将f2,f3的内容都放到f1中
        ((Folder) f1).add(f2);
        ((Folder) f1).add(f3);

        Folder f11 = new Folder("电影");
        f4 = new VideoFile("笑傲江湖.avi");
        f5 = new VideoFile("神雕侠侣.avi");
        f11.add(f4);
        f11.add(f5);
        ((Folder) f1).add(f11);

//        f2.killVirus();
        f1.killVirus();
    }
}

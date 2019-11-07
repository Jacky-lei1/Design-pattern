package com.bjsxt.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-07 12:11
 */
public interface AbstractFile {
    void killVirus();//杀毒
}

/**
 * 查杀图片文件
 */
class ImageFile implements AbstractFile{

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("--图像文件:"+name+",进行查杀！");
    }
}

/**
 * 查杀文本文件
 */
class TextFile implements AbstractFile{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("--文本文件"+name+",进行查杀！");
    }
}


/**
 * 查杀视频文件
 */
class VideoFile implements AbstractFile{

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("--视频文件"+name+",进行查杀！");
    }
}

class Folder implements AbstractFile{

    private String name;
    /*用来存放这个本容器构件下的子节点*/
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile getChild(int index){
        return list.get(index);
    }

    /*递归查杀*/
    public void killVirus() {
        System.out.println("---文件夹："+name+",进行查杀");
        /*遍历容器中的集合，循环查杀*/
        for (AbstractFile file:list){
            file.killVirus();
        }
    }
}

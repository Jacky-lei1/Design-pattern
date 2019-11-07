package com.bjsxt.bridge;

import javax.sound.midi.Soundbank;

/**
 * 品牌
 * @author lvyelanshan
 * @create 2019-11-07 10:42
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand{

    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Dell implements Brand{

    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}
class shengzhou implements Brand{

    public void sale() {
        System.out.println("销售神州电脑");
    }
}

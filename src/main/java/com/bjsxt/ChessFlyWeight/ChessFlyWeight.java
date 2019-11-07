package com.bjsxt.ChessFlyWeight;

/**
 * 享元类
 * @author lvyelanshan
 * @create 2019-11-07 15:22
 */
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c); //显示棋子
}

class ConcretaChess implements ChessFlyWeight{

    private String color;

    public ConcretaChess(String color) {
        this.color = color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void display(Coordinate c) {
        System.out.println("棋子颜色"+color);
        System.out.println("棋子位置"+c.getX()+"---"+c.getY());
    }
}

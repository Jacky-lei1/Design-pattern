package com.bjsxt.ChessFlyWeight;

/**
 * @author lvyelanshan
 * @create 2019-11-07 15:33
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getClass("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getClass("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理-----");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));

    }
}

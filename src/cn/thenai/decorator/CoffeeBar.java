package cn.thenai.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class CoffeeBar {
    public static void main(String[] args) throws Exception {

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("D://ABC.txt"));
        System.out.println(dataInputStream.read());
        dataInputStream.close();

        Drink order = new LongBlack();
        System.out.println(order.cost());
        System.out.println(order.getDesc());

        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());

        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());

        order = new LongBlack(order);
        System.out.println(order.cost());
        System.out.println(order.getDesc());
    }
}
package cn.thenai.factory.factorymethod.order;

import cn.thenai.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //定义一个抽象方法
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 由工厂子类完成
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    // 动态获取用户希望获取披萨种类
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
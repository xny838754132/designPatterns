package cn.thenai.factory.abstractfactory.order;

import cn.thenai.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        this.setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza;
        String orderType;
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

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
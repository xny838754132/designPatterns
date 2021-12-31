package cn.thenai.factory.simplefactory.order;

import cn.thenai.factory.simplefactory.pizza.CheesePizza;
import cn.thenai.factory.simplefactory.pizza.GreekPizza;
import cn.thenai.factory.simplefactory.pizza.PepperPizza;
import cn.thenai.factory.simplefactory.pizza.Pizza;
import org.jetbrains.annotations.NotNull;

//简单工厂类
public class SimpleFactory {
    // 根据orderType返回对应的Pizza对象 静态工厂模式
    public static Pizza createPizza(@NotNull String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza;
        switch (orderType) {
            case "greek" -> {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }
            case "cheese" -> {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }
            case "pepper" -> {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }
            default -> pizza = null;
        }
        return pizza;
    }
}
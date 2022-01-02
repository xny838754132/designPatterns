package cn.thenai.factory.abstractfactory.order;

import cn.thenai.factory.abstractfactory.pizza.BJCheesePizza;
import cn.thenai.factory.abstractfactory.pizza.BJPepperPizza;
import cn.thenai.factory.abstractfactory.pizza.Pizza;

// 工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
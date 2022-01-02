package cn.thenai.factory.factorymethod.order;

import cn.thenai.factory.factorymethod.pizza.LDCheesePizza;
import cn.thenai.factory.factorymethod.pizza.LDPepperPizza;
import cn.thenai.factory.factorymethod.pizza.Pizza;
import org.jetbrains.annotations.NotNull;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(@NotNull String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
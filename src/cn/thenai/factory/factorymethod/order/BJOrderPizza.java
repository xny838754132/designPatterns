package cn.thenai.factory.factorymethod.order;

import cn.thenai.factory.factorymethod.pizza.BJCheesePizza;
import cn.thenai.factory.factorymethod.pizza.BJPepperPizza;
import cn.thenai.factory.factorymethod.pizza.Pizza;
import org.jetbrains.annotations.NotNull;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(@NotNull String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
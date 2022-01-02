package cn.thenai.factory.abstractfactory.order;

import static cn.thenai.factory.factorymethod.order.PizzaStore.getLocal;

public class PizzaStore {
    public static void main(String[] args) {
        String local = getLocal();
        if (local.equals("bj")) {
            new OrderPizza(new BJFactory());
        } else {
            new OrderPizza(new LDFactory());
        }
    }

}
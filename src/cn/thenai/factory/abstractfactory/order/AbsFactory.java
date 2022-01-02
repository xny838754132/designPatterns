package cn.thenai.factory.abstractfactory.order;

import cn.thenai.factory.abstractfactory.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层
 */
public interface AbsFactory {

    Pizza createPizza(String orderType);
}
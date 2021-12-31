package cn.thenai.factory.simplefactory.order;

// 相当与一个客户端，发出订购任务
public class PizzaStore {
    public static void main(String[] args) {
        //使用简单工厂模式
        new OrderPizza();
        System.out.println("~~退出了程序~~");
    }
}
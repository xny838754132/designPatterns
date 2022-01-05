package cn.thenai.decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        this.setDesc("牛奶");
        this.setPrice(2);
    }
}
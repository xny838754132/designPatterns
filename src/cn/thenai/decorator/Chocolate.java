package cn.thenai.decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        this.setDesc("巧克力");
        this.setPrice(3);
    }
}
package cn.thenai.decorator;

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        this.setDesc("豆浆");
        this.setPrice(1);
    }
}
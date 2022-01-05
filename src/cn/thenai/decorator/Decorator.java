package cn.thenai.decorator;

public class Decorator extends Drink {

    private final Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ":" + super.getPrice() + "&&" + drink.getDesc();
    }
}
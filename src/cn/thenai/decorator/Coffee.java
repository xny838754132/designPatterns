package cn.thenai.decorator;

public class Coffee extends Drink {

    @Override
    public double cost() {
        return super.getPrice();
    }
}
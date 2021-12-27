package com.nai.decorator.demo;

public class TShirts extends Finery {

    public TShirts(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("TShirt");
        super.show();
    }
}
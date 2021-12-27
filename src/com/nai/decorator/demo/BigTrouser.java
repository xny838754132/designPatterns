package com.nai.decorator.demo;

public class BigTrouser extends Finery {

    public BigTrouser(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("喇叭裤");
        super.show();
    }
}
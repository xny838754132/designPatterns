package com.nai.decorator.demo;

public class Finery extends Person {

    protected Person component;

    public Finery(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
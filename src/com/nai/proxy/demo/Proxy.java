package com.nai.proxy.demo;

public class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(Girl girl) {
        this.gg = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
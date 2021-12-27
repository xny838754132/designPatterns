package com.nai.proxy.demo;

public class Pursuit implements GiveGift {

    Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + "送娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + "送鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "送巧克力");
    }
}
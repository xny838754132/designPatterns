package com.nai.proxy.demo;

public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("MM");

        Proxy proxy = new Proxy(girl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();

    }
}
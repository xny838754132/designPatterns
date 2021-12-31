package com.nai.factorymethod;

public class Client {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.BuyRice();
        student.sweep();
        student.wash();
    }
}
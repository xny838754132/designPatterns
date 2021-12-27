package com.nai.simplefactory;

/**
 * 简单工厂模式~
 */
public class Client {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNumberA(10);
        operate.setNumberB(20);
        double result = 0;
        try {
            result = operate.getResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
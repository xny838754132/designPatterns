package com.nai.simplefactory;

public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            System.out.println("除数不能为0");
            return -1;
        }
        return getNumberA() / getNumberB();
    }
}
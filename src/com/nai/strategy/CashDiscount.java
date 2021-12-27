package com.nai.strategy;

/**
 * 打折收费
 */
public class CashDiscount implements CashSuper {

    private double moneyDiscount = 1D;


    public CashDiscount(String moneyDiscount) {
        this.moneyDiscount = Double.parseDouble(moneyDiscount);
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyDiscount;
    }
}
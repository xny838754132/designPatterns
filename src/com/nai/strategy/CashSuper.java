package com.nai.strategy;

public interface CashSuper {
    /**
     * 收费的接口方法
     *
     * @param money
     * @return
     */
    double acceptCash(double money);
}
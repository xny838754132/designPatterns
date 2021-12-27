package com.nai.strategy;

/**
 * TODO 基础的策略模式-待改进
 */
public class Client {
    public static double total = 0;

    public static void main(String[] args) {
        CashContext context = new CashContext("正常收费");
        double totalPrices = context.getResult(100 * 10);
        total += totalPrices;
    }
}
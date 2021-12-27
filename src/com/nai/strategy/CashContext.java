package com.nai.strategy;

import org.jetbrains.annotations.NotNull;

public class CashContext {

    private CashSuper cs;

    public CashContext(@NotNull String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300反100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashDiscount("8");
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
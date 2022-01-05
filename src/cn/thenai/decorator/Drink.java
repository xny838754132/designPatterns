package cn.thenai.decorator;

public abstract class Drink {

    // 描述
    private String desc;

    private double price = 0.0D;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 计算费用
    public abstract double cost();
}
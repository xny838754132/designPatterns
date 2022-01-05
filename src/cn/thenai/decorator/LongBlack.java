package cn.thenai.decorator;

public class LongBlack extends Coffee {

    public LongBlack() {
        this.setPrice(13);
        this.setDesc("美式咖啡");
    }

    public LongBlack(Drink drink) {
        this.setDesc(this.getDesc() + "&&" + drink.getDesc());
        this.setPrice(this.getPrice() + drink.getPrice());
    }
}
package cn.thenai.adapter.objectadapter;

public class Phone {
    public void changing(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压=" + voltage5V.output5V() + "V,电压正常开始充电");
        } else {
            System.out.println("电压错误！");
        }
    }
}
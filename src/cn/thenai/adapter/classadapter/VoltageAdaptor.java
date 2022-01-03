package cn.thenai.adapter.classadapter;

public class VoltageAdaptor extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        // 获取220V电压
        int src = super.output220V();
        return src / 44;
    }
}
package cn.thenai.adapter.classadapter;

public class VoltageAdaptor extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        // č·å220Vēµå
        int src = super.output220V();
        return src / 44;
    }
}
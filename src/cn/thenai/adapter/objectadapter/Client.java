package cn.thenai.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.changing(new VoltageAdaptor(new Voltage220V()));
    }
}
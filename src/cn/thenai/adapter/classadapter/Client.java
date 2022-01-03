package cn.thenai.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.changing(new VoltageAdaptor());
    }
}
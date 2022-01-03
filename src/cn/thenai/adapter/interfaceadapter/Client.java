package cn.thenai.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void operation1() {
                System.out.println("使用了方法1");
            }
        };
    }
}
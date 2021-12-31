package cn.thenai.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}

class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    // 提供一个静态公有方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
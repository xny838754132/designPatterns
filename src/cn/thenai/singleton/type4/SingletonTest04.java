package cn.thenai.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}

class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    // 提供一个静态公有方法，加入了同步处理的代码，解决了线程安全问题
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2() {
    }
    public static synchronized Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                INSTANCE = new Singleton2();
            }
        }
        return INSTANCE;
    }
}
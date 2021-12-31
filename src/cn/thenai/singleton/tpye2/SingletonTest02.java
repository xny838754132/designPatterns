package cn.thenai.singleton.tpye2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
    }
}

class Singleton {
    // 1.构造器私有化
    private Singleton() {
    }

    // 2.本类内部创建对象实例
    private static Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    // 3.提供静态公共方法
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
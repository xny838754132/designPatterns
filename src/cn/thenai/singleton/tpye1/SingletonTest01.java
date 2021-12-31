package cn.thenai.singleton.tpye1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
    }
}

class Singleton {
    // 1.构造器私有化
    private Singleton() {
    }

    // 2.本类内部创建对象实例
    private final static Singleton INSTANCE = new Singleton();

    // 3.提供静态公共方法
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
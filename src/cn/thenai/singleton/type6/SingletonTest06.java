package cn.thenai.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }

}

class Singleton {

    private Singleton() {
    }

    private static class SingletonInstance {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
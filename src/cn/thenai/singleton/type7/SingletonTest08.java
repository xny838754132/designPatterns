package cn.thenai.singleton.type7;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance);
        System.out.println(instance1);
        instance.sayOK();
        instance1.sayOK();
    }

}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }
}
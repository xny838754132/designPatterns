package cn.thenai.prototype.deepclone;

public class Client {
    public static void main(String[] args) {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "奶牛";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("小牛", "小牛的类");

        System.out.println(deepPrototype.hashCode() + ":" + deepPrototype.deepCloneableTarget.hashCode());
        DeepPrototype clone = deepPrototype.deepClone();
        System.out.println(clone.hashCode() + ":" + clone.deepCloneableTarget.hashCode());
    }
}
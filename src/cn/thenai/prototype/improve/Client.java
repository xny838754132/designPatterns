package cn.thenai.prototype.improve;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "白色", "蒙古");
        sheep.friend = new Sheep("jack", 2, "黑色", "香港");
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();
        System.out.println(sheep + ":" + sheep.friend.hashCode());
        System.out.println(sheep1 + ":" + sheep1.friend.hashCode());
        System.out.println(sheep2 + ":" + sheep2.friend.hashCode());
        System.out.println(sheep3 + ":" + sheep2.friend.hashCode());
        System.out.println(sheep4 + ":" + sheep.friend.hashCode());
        System.out.println(sheep5 + ":" + sheep.friend.hashCode());

    }
}
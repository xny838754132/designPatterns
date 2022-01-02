package cn.thenai.prototype.improve;

import java.util.Objects;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address;
    public Sheep friend;


    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    /**
     * 使用默尔clone方法克隆该实例
     **/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep(String name, int age, String color, String address) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheep sheep = (Sheep) o;
        return age == sheep.age && Objects.equals(name, sheep.name) && Objects.equals(color, sheep.color) && Objects.equals(address, sheep.address) && Objects.equals(friend, sheep.friend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, address, friend);
    }
}
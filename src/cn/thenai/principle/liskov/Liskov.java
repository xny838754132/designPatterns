package cn.thenai.principle.liskov;

public class Liskov {

}

//基类
class Base {

}

class A extends Base {
    public int func1(int var1, int var2) {
        return var1 - var2;
    }
}

class B extends Base {

    private A a = new A();

    public int func2(int var1, int var2) {
        return var1 + var2;
    }

    public int func3(int var1, int var2) {
        return this.a.func1(var1, var2);
    }
}
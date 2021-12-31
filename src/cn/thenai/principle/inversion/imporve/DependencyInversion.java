package cn.thenai.principle.inversion.imporve;

import org.jetbrains.annotations.NotNull;

/**
 * 依赖倒转原则实例
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }

}

interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件：hello world";
    }
}

class Wechat implements IReceiver {
    @Override
    public String getInfo() {
        return "微信消息：hello";
    }
}

class Person {
    public void receive(@NotNull IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
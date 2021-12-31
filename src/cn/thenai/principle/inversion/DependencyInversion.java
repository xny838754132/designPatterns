package cn.thenai.principle.inversion;

public class DependencyInversion {

    public static void main(String[] args) {

    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息: hello world";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
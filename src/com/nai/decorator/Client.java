package com.nai.decorator;

import com.nai.decorator.demo.BigTrouser;
import com.nai.decorator.demo.Person;

/**
 * 装饰者模式
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("小明");
        BigTrouser bigTrouser = new BigTrouser(person);
        bigTrouser.show();
    }
}
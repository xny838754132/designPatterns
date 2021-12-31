package cn.thenai.uml.associtation.composition;

import cn.thenai.uml.dependence.IDCard;

public class Person {
    private IDCard idCard; // 聚合关系
    private Head head = new Head(); // 组合关系
}
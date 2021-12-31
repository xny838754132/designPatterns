package com.nai.protytype;

public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
}
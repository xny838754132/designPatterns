package cn.thenai.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    // 存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println("---------" + getName() + "----------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            System.out.println(organizationComponent.getName() + ":" + organizationComponent.getDesc());
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponent.remove(organizationComponent);
    }

    @Override
    public String toString() {
        return "College{" +
                "organizationComponents=" + organizationComponents +
                '}';
    }
}
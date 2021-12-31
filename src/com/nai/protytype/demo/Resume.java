package com.nai.protytype.demo;

public class Resume implements Cloneable {

    private String name;
    private String sex;
    private int age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.println("name=" + name + ",sex=" + sex + ",age=" + age);
        System.out.println("工作经历=" + workExperience.getWorkDate() + ",工作单位=" + workExperience.getCompany());
    }

    @Override
    public Resume clone() {
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
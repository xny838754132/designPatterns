package com.nai.protytype.demo;

public class Client {

    public static void main(String[] args) {
        Resume resume = new Resume("帅帅");
        resume.setPersonalInfo("男", 20);
        resume.setWorkExperience("2000-2020", "x公司");

        Resume clone = resume.clone();
        clone.setWorkExperience("1999-2011", "b公司");

        Resume clone1 = resume.clone();
        clone1.setPersonalInfo("男", 30);

        resume.display();

        clone.display();
        clone1.display();
    }

}
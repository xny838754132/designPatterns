package cn.thenai.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("清华大学", "中国顶级大学");
        // 创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "全是秃子");
        OrganizationComponent InfoEngineerCollege = new College("信息工程学院", "信息工程学院");

        // 创建各个系
        OrganizationComponent soft = new Department("软件工程", "软件工程");
        OrganizationComponent inter = new Department("网络工程", "网络工程");
        OrganizationComponent com = new Department("计算机科学与技术", "计算机科学与技术");

        Department tongXin = new Department("通信工程", "通信工程");

        computerCollege.add(soft);
        computerCollege.add(inter);
        computerCollege.add(com);
        university.add(computerCollege);

        InfoEngineerCollege.add(tongXin);
        university.add(InfoEngineerCollege);
        university.print();
        computerCollege.print();
        InfoEngineerCollege.print();

    }
}
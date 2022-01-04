package cn.thenai.bridge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMiBrand());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        FoldedPhone huawei = new FoldedPhone(new HuaWeiBrand());
        huawei.open();
        huawei.call();
        huawei.close();
    }
}
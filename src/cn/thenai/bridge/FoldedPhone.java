package cn.thenai.bridge;

public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.println("打开折叠手机");
        super.open();
    }

    @Override
    protected void close() {
        System.out.println("关闭折叠手机");
        super.close();
    }

    @Override
    protected void call() {
        System.out.println("折叠手机打电话");
        super.call();
    }
}
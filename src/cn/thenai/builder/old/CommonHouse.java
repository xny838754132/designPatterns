package cn.thenai.builder.old;

public class CommonHouse extends AbstractHouse {
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");
    }
}
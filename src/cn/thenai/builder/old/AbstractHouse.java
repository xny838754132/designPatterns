package cn.thenai.builder.old;

public abstract class AbstractHouse {
    abstract void buildBasic();

    abstract void buildWalls();

    abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
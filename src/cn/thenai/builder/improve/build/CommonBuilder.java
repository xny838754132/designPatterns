package cn.thenai.builder.improve.build;

public class CommonBuilder extends HouseBuilder {
    @Override
    public CommonBuilder buildBasic() {
        this.house.setBasic("打地基5米");
        return this;
    }

    @Override
    public CommonBuilder buildWalls() {
        this.house.setWall("砌墙10厘米");
        return this;
    }

    @Override
    public CommonBuilder roofed() {
        this.house.setRoofed("盖普通屋顶");
        return this;
    }
}
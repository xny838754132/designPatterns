package cn.thenai.builder.improve.build;

public class HighBuilder extends HouseBuilder {
    @Override
    public HighBuilder buildBasic() {
        this.house.setBasic("打地基50米");
        return this;
    }

    @Override
    public HighBuilder buildWalls() {
        this.house.setWall("砌墙20厘米");
        return this;
    }

    @Override
    public HighBuilder roofed() {
        this.house.setRoofed("高楼屋顶");
        return this;
    }
}
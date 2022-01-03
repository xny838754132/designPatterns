package cn.thenai.builder.improve;

import cn.thenai.builder.improve.build.HouseBuilder;

/**
 * 指挥者-动态去指定制作流程-返回产品
 */
public class HouseDirector {

    HouseBuilder houseBuilder;

    //构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //set方法传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        HouseBuilder builder = houseBuilder.buildBasic()
                .buildWalls()
                .roofed();
        return builder.buildHouse();
    }

}
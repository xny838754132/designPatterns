package cn.thenai.builder.improve.build;

import cn.thenai.builder.improve.House;

/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    // 建造的流程，抽象
    public abstract HouseBuilder buildBasic();

    public abstract HouseBuilder buildWalls();

    public abstract HouseBuilder roofed();

    // 建造房子,将产品返回
    public House buildHouse() {
        return house;
    }
}
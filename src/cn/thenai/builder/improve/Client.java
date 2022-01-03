package cn.thenai.builder.improve;


import cn.thenai.builder.improve.build.CommonBuilder;
import cn.thenai.builder.improve.build.HighBuilder;
import cn.thenai.builder.improve.build.HouseBuilder;

public class Client {
    public static void main(String[] args) {
        // 普通房子
        HouseBuilder commonHouse = new CommonBuilder();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房子,返回产品
        House house = houseDirector.constructHouse();
        System.out.println(house);

        // 高楼
        HouseBuilder highBuilder = new HighBuilder();
        houseDirector.setHouseBuilder(highBuilder);
        House highHouse = houseDirector.constructHouse();
        System.out.println(highHouse);
    }
}
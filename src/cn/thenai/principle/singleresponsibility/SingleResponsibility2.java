package cn.thenai.principle.singleresponsibility;

public class SingleResponsibility2 {
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在地上跑");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上跑");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中跑");
    }
}
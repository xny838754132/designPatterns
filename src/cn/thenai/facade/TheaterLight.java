package cn.thenai.facade;

public class TheaterLight {

    private static final TheaterLight THEATER_LIGHT = new TheaterLight();

    public static TheaterLight getInstance() {
        return THEATER_LIGHT;
    }


    public void up(){
        System.out.println("TheaterLight up");
    }

    public void down(){
        System.out.println("TheaterLight down");
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }


}
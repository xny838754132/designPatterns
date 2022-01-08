package cn.thenai.facade;

public class Projector {
    private static final Projector PROJECTOR = new Projector();

    public static Projector getInstance() {
        return PROJECTOR;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void focus(){
        System.out.println("popcorn is focus");
    }
}
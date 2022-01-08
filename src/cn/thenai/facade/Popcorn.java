package cn.thenai.facade;

public class Popcorn {

    private static final Popcorn POPCORN = new Popcorn();

    public static Popcorn getInstance() {
        return POPCORN;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }

    public void pop(){
        System.out.println("popcorn is pop");
    }

}
package cn.thenai.facade;

public class Screen {
    private static final Screen SCREEN = new Screen();

    public static Screen getInstance() {
        return SCREEN;
    }

    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Screen down");
    }
}
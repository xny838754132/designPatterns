package cn.thenai.facade;

public class Stereo {
    private static final Stereo STEREO = new Stereo();

    public static Stereo getInstance() {
        return STEREO;
    }

    public void up(){
        System.out.println("Stereo up");
    }

    public void down(){
        System.out.println("Stereo down");
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }
}
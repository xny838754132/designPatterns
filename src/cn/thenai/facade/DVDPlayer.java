package cn.thenai.facade;

public class DVDPlayer {

    // 使用单例模式
    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD ON");
    }

    public void off() {
        System.out.println("DVD OFF");
    }

    public void play() {
        System.out.println("DVD IS PLAY");
    }
}
package cn.thenai.facade;

public class HomeTheaterFacade {
    // 定有子系统对象
    private final TheaterLight theaterLight;

    private final Popcorn popcorn;

    private final Stereo stereo;

    private final Projector projector;

    private final Screen screen;

    private final DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.up();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.down();
    }

    public void player(){
        dvdPlayer.play();
    }

    public void end(){
        popcorn.off();
        theaterLight.on();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
package FacadeDesignPattern;

public class HomeTheaterFacade {
    Lights light = new Lights();
    SoundSystem sound = new SoundSystem();
    Projector projector = new Projector();
    MediaPlayer player = new MediaPlayer();

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        light.dim();
        sound.turnOn();
        projector.turnOn();
        player.playingMovie(movie);
    }

}

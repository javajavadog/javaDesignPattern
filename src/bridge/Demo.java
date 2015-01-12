package bridge;

public class Demo {
    public static void main(String[] args) {
        Player p = new PlayerForUnix();
        p.setVideoFile(new MPEGFile());
        p.play();
    }
}

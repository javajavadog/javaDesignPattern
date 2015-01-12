package bridge;

public class PlayerForUnix extends Player{

    @Override
    void play() {
        System.out.println("playing video file " + mVideoFile + " on UNIX");
    }

}

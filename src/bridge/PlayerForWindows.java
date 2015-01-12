package bridge;

public class PlayerForWindows extends Player {

    @Override
    void play() {
        System.out.println("playing video file " + mVideoFile + " on windows");
    }

}

package command;

public class PlayCommand implements Command {
    
    private AudioPlayer mAudioPlayer;

    public PlayCommand(AudioPlayer ap){
        mAudioPlayer = ap;
    }

    @Override
    public void execute() {
        mAudioPlayer.play();
    }

}

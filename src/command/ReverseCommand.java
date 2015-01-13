package command;

public class ReverseCommand implements Command {
    private AudioPlayer mAudioPlayer;

    public ReverseCommand(AudioPlayer ap) {
        mAudioPlayer = ap;
    }

    @Override
    public void execute() {
        mAudioPlayer.reverse();
    }

}

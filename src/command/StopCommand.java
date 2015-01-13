package command;

public class StopCommand implements Command {
    private AudioPlayer mAudioPlayer;

    public StopCommand(AudioPlayer ap) {
        mAudioPlayer = ap;
    }

    @Override
    public void execute() {
        mAudioPlayer.stop();
    }

}

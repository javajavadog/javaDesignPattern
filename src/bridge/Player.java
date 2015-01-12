package bridge;

public abstract class Player {
    protected VideoFile mVideoFile;
    
    public void setVideoFile(VideoFile vf){
        mVideoFile = vf;
    }
    
    abstract void play();
}

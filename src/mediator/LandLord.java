package mediator;

public class LandLord {
    public String mName;
    public int mAimPrice;
    
    private Mediator mMediator;
    
    public LandLord(String name, Mediator m, int aimPrice){
        mName = name;
        mMediator = m;
        mAimPrice = aimPrice;
        mMediator.addLandLord(this);
    }
    
    public void getLodger(){
        mMediator.getLodger(this);
    }
}

package mediator;

public class Lodger {
    public String mName;
    public int mAimPrice;
    
    private Mediator mMediator;
    
    public Lodger(String name, Mediator m, int aimPrice){
        mName = name;
        mMediator = m;
        mAimPrice = aimPrice;
        mMediator.addLodger(this);
    }
    
    public void getHouse(){
        mMediator.getHouse(this);
    }
}

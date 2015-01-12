package chainofresponsibility;

public class Head {
    private static final int HANDLE_LEVEL = Sign.LEVEL_3;
    
    public boolean sign(Sign s){
        if (s.mLevel == HANDLE_LEVEL) {
            s.mSigned = true;
            System.out.println(this + " signed the letter");
            return true;
        }
        System.out.println(this + " can not handle the letter");
        return false;
    }

}

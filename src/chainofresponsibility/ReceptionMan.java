package chainofresponsibility;

public class ReceptionMan {
    private static final int HANDLE_LEVEL = Sign.LEVEL_1;
    
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

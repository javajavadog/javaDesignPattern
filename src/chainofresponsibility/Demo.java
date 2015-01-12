package chainofresponsibility;

public class Demo {
    public static void main(String[] args) {
        Sign s = new Sign();
        s.mLevel = Sign.LEVEL_4;
        s.mSignName = "top secret letter";
                
        SignHandler sh = new SignHandler();
        sh.signLetter(s);
    }
}

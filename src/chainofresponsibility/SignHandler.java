package chainofresponsibility;

public class SignHandler {
    public boolean signLetter(Sign s){
        ReceptionMan rm = new ReceptionMan();
        if (rm.sign(s)) {
            return true;
        }
        Chief cf = new Chief();
        if (cf.sign(s)) {
            return true;
        }
        Head hd = new Head();
        if (hd.sign(s)) {
            return true;
        }
        System.out.println("no one can sign letter");
        return false;
    }
}

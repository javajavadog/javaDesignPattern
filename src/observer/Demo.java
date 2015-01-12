package observer;

public class Demo {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        
        ObserverImpl ob1 = new ObserverImpl();
        ObserverImpl ob2 = new ObserverImpl();
        
        subject.attach(ob1);
        subject.attach(ob2);
        
        subject.notifyObserver();
    }
}

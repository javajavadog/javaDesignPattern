package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubjectImpl implements Subject {
    private List<Observer> mObserverList = new ArrayList<Observer>();

    @Override
    public void attach(Observer o) {
        mObserverList.add(o);
    }

    @Override
    public void detach(Observer o) {
        mObserverList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Iterator<Observer> iterator = mObserverList.iterator(); iterator.hasNext();) {
            Observer ob = (Observer) iterator.next();
            ob.update();
        }
    }

}

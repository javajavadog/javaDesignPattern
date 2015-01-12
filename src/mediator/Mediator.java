package mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mediator {
    List<Lodger> mLodgerList = new ArrayList<Lodger>();
    List<LandLord> mLandLordList = new ArrayList<LandLord>();

    public void addLodger(Lodger l) {
        mLodgerList.add(l);
    }

    public void addLandLord(LandLord l) {
        mLandLordList.add(l);
    }

    public void getHouse(Lodger l) {
        for (Iterator<LandLord> ll = mLandLordList.iterator(); ll.hasNext();) {
            LandLord landLord = (LandLord) ll.next();
            if (landLord.mAimPrice < l.mAimPrice) {
                System.out.println("Landlord " + landLord.mName + " is renting his house at price: "
                        + landLord.mAimPrice);
            }
        }
    }

    public void getLodger(LandLord l) {
        for (Iterator<Lodger> ll = mLodgerList.iterator(); ll.hasNext();) {
            Lodger lodger = (Lodger) ll.next();
            if (lodger.mAimPrice > l.mAimPrice) {
                System.out.println("Lodger " + lodger.mName + " is wanting house at price: " + lodger.mAimPrice);
            }
        }
    }
}

package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ApplePie implements Iterator<String> {
    private List<String> mPieList = new ArrayList<String>();
    private int mPosition;

    public ApplePie() {
        mPieList.add("Pie1");
        mPieList.add("Pie2");
        mPieList.add("Pie3");
        mPieList.add("Pie4");
        mPieList.add("Pie5");
        mPieList.add("Pie6");
        mPieList.add("Pie7");
        mPieList.add("Pie8");
        mPieList.add("Pie9");
    }

    @Override
    public boolean hasNext() {
        if (mPosition < mPieList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return mPieList.get(mPosition++);
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {
        // TODO Auto-generated method stub

    }

}

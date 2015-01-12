package composite;

import java.util.ArrayList;
import java.util.List;


public class MenuComposite extends MenuComponent{
    private List<MenuComponent> mComponentList = new ArrayList<MenuComponent>();
    
    public void add(MenuComponent m){
        mComponentList.add(m);
    }

    public void remove(MenuComponent m){
        mComponentList.remove(m);
    }

    public void display(){
        for(int i = 0; i < mComponentList.size(); i++){
            System.out.println(mComponentList.get(i).mName);
        }
    }
}

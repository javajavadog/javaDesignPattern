package composite;

import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void main(String[] args){
        List<MenuComponent> componentList = new ArrayList<MenuComponent>();
        
        MenuComponent m1 = new MenuComposite();
        m1.mName = "CCTV";

        MenuComponent m2 = new Leaf();
        m2.mName = "CCTV-1";
        MenuComponent m3 = new Leaf();
        m3.mName = "CCTV-2";
        MenuComponent m4 = new Leaf();
        m4.mName = "CCTV-3";
        
        m1.add(m2);
        m1.add(m3);
        m1.add(m4);
        
        MenuComponent m5 = new MenuComposite();
        m5.mName = "Local-TV";
        
        MenuComponent m6 = new Leaf();
        m6.mName = "SiChuan-TV";
        MenuComponent m7 = new Leaf();
        m7.mName = "Hunan-TV";
        
        m5.add(m6);
        m5.add(m7);
        
        MenuComponent m8 = new MenuComposite();
        m8.mName = "SiChuan-All";
        m8.add(m6);
        
        m5.add(m8);
        
        componentList.add(m1);
        componentList.add(m2);
        componentList.add(m3);
        componentList.add(m4);
        componentList.add(m5);
        componentList.add(m6);
        componentList.add(m7);
        componentList.add(m8);
        
        for (int i = 0; i < componentList.size(); i++) {
            componentList.get(i).display();
        }
    }
}

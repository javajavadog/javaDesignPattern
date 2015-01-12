
public class Leaf extends MenuComponent {
    public void add(MenuComponent m){
        System.out.println("can't add component to leaf");
    }

    public void remove(MenuComponent m){
        System.out.println("can't remove component to leaf");
    }

    public void display(){
        System.out.println(mName);
    }
}

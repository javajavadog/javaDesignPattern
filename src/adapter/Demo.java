package adapter;


public class Demo {
    public static void main(String args[]){
        Toy t = new Toy();

        Electric220v e220 = new Electric220v();

        Adapter a = new Adapter();
        t.run(a.getElectric5v(e220));
    }
}

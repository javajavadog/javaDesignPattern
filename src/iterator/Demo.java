package iterator;


public class Demo {
    public static void main(String[] args) {
        ApplePie ap = new ApplePie();
        while (ap.hasNext()) {
            System.out.println(ap.next());
        }
    }
}

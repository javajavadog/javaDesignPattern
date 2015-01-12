package proxy;

public class Demo {
    public static void main(String[] args) {
        Image image = new ImageProxy();
        image.load();
        image.show();
    }
}

package singleton;

public class Demo {
    public static void main(String[] args) {
        DataManager.getInstance().add();
        DataManager.getInstance().remove();
    }
}

package prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Apple apple = new Apple();
        apple.name = "yellow";

        Apple apple2 = apple.clone();
        System.out.println("apple2 name: " + apple2.name);
        
        apple2.name = "green";
        System.out.println("apple2 name: " + apple2.name);
        
        System.out.println("apple name: " + apple.name);
    }
}

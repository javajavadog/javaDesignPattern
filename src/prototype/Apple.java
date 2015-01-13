package prototype;

public class Apple {
    public String name = "red apple";

    @Override
    protected Apple clone() throws CloneNotSupportedException {
        Apple apple = new Apple();
        apple.name = name;
        return apple;
    }

}

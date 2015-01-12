package factorymethod;

public class Demo {
    public static void main(String[] args) {
        LEDCreator creator = new LEDCreator();
        
        Light light = creator.factory();
        light.turnOn();
        light.turnOff();
    }
}

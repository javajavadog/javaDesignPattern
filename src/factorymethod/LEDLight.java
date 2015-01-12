package factorymethod;

public class LEDLight extends Light {

    @Override
    void turnOn() {
        System.out.println("LED light turn on");
    }

    @Override
    void turnOff() {
        System.out.println("LED light turn off");

    }

}

package factorymethod;

public class CCFLLight extends Light {

    @Override
    void turnOn() {
        System.out.println("CCFL light turn on");
    }

    @Override
    void turnOff() {
        System.out.println("CCFL light turn off");
    }

}

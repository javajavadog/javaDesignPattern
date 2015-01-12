package factorymethod;

public class LEDCreator extends LightCreator {

    @Override
    public Light factory() {
        return new LEDLight();
    }

}

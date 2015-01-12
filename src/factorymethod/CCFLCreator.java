package factorymethod;

public class CCFLCreator extends LightCreator {

    @Override
    public Light factory() {
        return new CCFLLight();
    }

}

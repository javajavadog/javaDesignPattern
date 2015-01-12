package proxy;

public class ImageProxy implements Image{
    ImageImpl mImage;

    @Override
    public void load() {
        System.out.println("Loading...");
        mImage = new ImageImpl();
        mImage.load();
    }

    @Override
    public void show() {
        mImage.show();
    }

}

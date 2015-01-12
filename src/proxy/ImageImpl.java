package proxy;

public class ImageImpl implements Image {

    @Override
    public void load() {
        // loading takes a long time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void show() {
        System.out.println("Picture shows");
    }

}

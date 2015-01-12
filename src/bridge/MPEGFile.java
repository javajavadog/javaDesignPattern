package bridge;

public class MPEGFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("MPEG file decoded");
    }

    @Override
    public String toString() {
        return "MPEG file";
    }

}

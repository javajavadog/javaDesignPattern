package bridge;

public class RMVBFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("RMVB file decoded");
    }

    @Override
    public String toString() {
        return "RMVB file";
    }

}

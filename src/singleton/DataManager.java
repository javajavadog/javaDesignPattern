package singleton;

public class DataManager {
    private static DataManager sInstance;
    
    private DataManager() {};
    
    public synchronized static DataManager getInstance(){
        if (sInstance == null) {
            sInstance = new DataManager();
        }
        return sInstance;
    }
    
    public void add(){
        System.out.println("add data");
    }
    
    public void remove(){
        System.out.println("remove data");
    }
    
}

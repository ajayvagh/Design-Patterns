package Singleton;

public class DBC {
    private DBC(){

    }
    private static DBC instance = null;
    public DBC getInstance(){
        if(instance == null){
            synchronized (this){
                if(instance == null){
                    instance = new DBC();
                }
            }
        }
        return instance;
    }
}

package Singleton;

public class DBCv1 {

    private DBCv1(){

    }
    private static DBCv1 instance = null;

    public static DBCv1 getInstance(){
        if(instance == null){
            instance = new DBCv1();
        }
        return instance;
    }
}

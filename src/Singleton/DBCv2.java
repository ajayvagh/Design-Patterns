package Singleton;

public class DBCv2 {
    private DBCv2(){

    }
    private static DBCv2 instance = new DBCv2();

    public static DBCv2 getInstance(){
        return instance;
    }
}

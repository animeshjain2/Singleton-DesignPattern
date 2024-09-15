package com.singleton;

public class DBConnection {

    private static volatile DBConnection obj;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if(obj == null)
        {
            synchronized (DBConnection.class) {
                if (obj == null) {
                    return obj = new DBConnection();
                }
            }
        }

        return obj;
    }
}

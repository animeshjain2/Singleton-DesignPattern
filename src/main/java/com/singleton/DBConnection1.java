package com.singleton;

public class DBConnection1 {

    private DBConnection1(){}

    private static class DBConnectionHelper{
        private static DBConnection1 INSTANCE_OBJECT = new DBConnection1();
    }

    public static DBConnection1 getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}

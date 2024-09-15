package com.singleton;

public class Main {
    public static void main(String[] args) {
            DBConnection db = DBConnection.getInstance();

            DBConnection1 db1 = DBConnection1.getInstance();

    }
}
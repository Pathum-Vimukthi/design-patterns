package com.designpatterns.creational.singleton;

public class DBConnectionDemo {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.connect();
    }
}

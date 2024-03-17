package com.designpatterns.creational.factory;

//
public class PQRNetwork implements Network{
    //override the getBillAmount method to get bill amount for PQR network
    @Override
    public void getBillAmount(double time) {
        System.out.println("Your bill amount is: " + time*7);
    }
}

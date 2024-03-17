package com.designpatterns.creational.factory;

public class XYZNetwork implements Network{
    //override the getBillAmount method to get bill amount for XYZ network
    @Override
    public void getBillAmount(double time) {
        System.out.println("Your bill amount is: " + time*10);
    }
}

package com.designpatterns.creational.factory;

public class ABCNetwork implements Network{
    //override the getBillAmount method to get bill amount for ABC network
    @Override
    public void getBillAmount(double time) {
        System.out.println("Your bill amount is: " + time*5);
    }
}

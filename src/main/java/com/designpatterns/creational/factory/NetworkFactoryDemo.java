package com.designpatterns.creational.factory;

public class NetworkFactoryDemo {
    public static void main(String[] args) {
        //create a NetworkFactory object
        NetworkFactory networkFactory = new NetworkFactory();

        //get an object of ABCNetwork and call its getBillAmount method
        Network network = networkFactory.getNetwork("ABC");
        network.getBillAmount(10);

        //get an object of PQRNetwork and call its getBillAmount method
        network = networkFactory.getNetwork("PQR");
        network.getBillAmount(10);

        //get an object of XYZNetwork and call its getBillAmount method
        network = networkFactory.getNetwork("XYZ");
        network.getBillAmount(10);
    }
}

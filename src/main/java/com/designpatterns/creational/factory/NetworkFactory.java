package com.designpatterns.creational.factory;

//create a NetworkFactory to generate object of concrete class based on given information
public class NetworkFactory {
    //use getNetwork method to get object of type Network
    public Network getNetwork(String networkType){
        if(networkType == null){
            return null;
        }
        if(networkType.equalsIgnoreCase("ABC")){
            return new ABCNetwork();
        } else if(networkType.equalsIgnoreCase("PQR")){
            return new PQRNetwork();
        } else if(networkType.equalsIgnoreCase("XYZ")){
            return new XYZNetwork();
        }
        return null;
    }
}

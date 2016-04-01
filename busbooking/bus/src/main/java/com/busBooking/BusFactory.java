package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public class BusFactory {
    private static BusFactory instance= new BusFactory();
    private BusFactory(){}
    public static  BusFactory getInstance(){
        return instance;
    }

    public Bus create(String numberPlate,BusStatus objBusStatus)
    {
        return new Bus(numberPlate,objBusStatus);
    }
}

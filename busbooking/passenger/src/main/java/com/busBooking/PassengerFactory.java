package com.busBooking;

/**
 * Created by student on 3/31/16.
 */
public class PassengerFactory {
    private static PassengerFactory instance= new PassengerFactory();
    private PassengerFactory()
    {}
    public static PassengerFactory getInstance()
    {
        return instance;
    }
   public Passenger create(String name,String idNum,Contact objContact)
    {

        return new Passenger( name,idNum, objContact);
    }
}

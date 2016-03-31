package com.busBooking;

/**
 * Created by student on 3/31/16.
 */
public class PassengerFactory {
   public Passenger create(String name,String idNum,Contact objContact)
    {
        return new Passenger( name,idNum, objContact);
    }
}

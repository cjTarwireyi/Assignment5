package com.busBooking;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/31/16.
 */
public class TestPassenger {
    private PassengerFactory objPassengerFactory;
    private Contact objCont;
    @Before
    public void setUp() throws Exception {
        objPassengerFactory= PassengerFactory.getInstance();

    }

    @Test
    public void testPassengerCreation() throws Exception {
       Passenger objPassenger= objPassengerFactory.create("","",objCont);
        Assert.assertEquals(objPassenger.getIdNum(),"");
        Assert.assertEquals(objPassenger.getName(),"");
        Assert.assertEquals(objPassenger.getContact(),objCont);
    }

    @Test
    public void testUpdatePassenger() throws Exception {
        Passenger objPassenger= objPassengerFactory.create("","",objCont);
        Assert.assertEquals(objPassenger.getIdNum(),"");
        Assert.assertEquals(objPassenger.getName(),"");
        Assert.assertEquals(objPassenger.getContact(),objCont);

        Passenger updatePassenger = new Passenger.PassengerBuilder()
                .copy(objPassenger)
                .name("Cornelious")
                .build();

                Assert.assertEquals(updatePassenger.getName(),"Cornelious");
                Assert.assertEquals(objPassenger.getIdNum(),updatePassenger.getIdNum());
                Assert.assertEquals(objPassenger.getContact(),updatePassenger.getContact());

    }
}

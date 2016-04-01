package com.busBooking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by student on 4/1/16.
 */
public class TestBooking {
    private ReservationFactory objReservFactory;
    private Ticket objTicket;
    private   Date mydate = new Date();
    @Before
    public void setUp() throws Exception {
        objReservFactory= ReservationFactory.getInstnce();


    }

    @Test
    public void testCreation() throws Exception {
        Date mydate = new Date();
        SeatReservation objReservation = objReservFactory.create(mydate,objTicket);
        Assert.assertEquals(objReservation.getMyDate(),mydate);
        Assert.assertEquals(objReservation.getObjTicket(),objTicket);
    }

    @Test
    public void testUpdate() throws Exception {

        SeatReservation objReservation = objReservFactory.create(mydate,objTicket);
        Assert.assertEquals(objReservation.getMyDate(),mydate);
        Assert.assertEquals(objReservation.getObjTicket(),objTicket);

        SeatReservation objBuilder = new SeatReservation.ReservationBuilder()
                .objTicket(objTicket)
                .MyDate(mydate)
                .build();
        Assert.assertEquals(objReservation.getMyDate(), objBuilder.getMyDate());
        Assert.assertEquals(objReservation.getObjTicket(), objBuilder.getObjTicket());
    }
}

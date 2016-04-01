package com.busBooking;

import java.util.Date;

/**
 * Created by student on 4/1/16.
 */
public class ReservationFactory {
    private  static ReservationFactory instance = new ReservationFactory();
    private ReservationFactory(){}

    public static ReservationFactory getInstnce()
    {
        return instance;
    }
    SeatReservation create(Date myDate, Ticket objTicket )
    {
        return new SeatReservation(myDate,objTicket);
    }
}

package com.busBooking;

import java.util.Date;

/**
 * Created by student on 4/1/16.
 */
public class SeatReservation implements  SeatIncrement{

    private Date myDate = new Date();
    private Ticket objTicket;
    public SeatReservation(ReservationBuilder objreservBuilder){
        myDate=objreservBuilder.myDate;
        objTicket=objreservBuilder.objTicket;
    }
    public SeatReservation(Date myDate,Ticket objTicket){
        this.myDate=myDate;
        this.objTicket=objTicket;

    }
    public int seatCount() {
        int seats=0;
        return seats++;
    }

    public Date getMyDate() {
        return myDate;
    }

    public Ticket getObjTicket() {
        return objTicket;
    }

    public static class ReservationBuilder
    {
        private Date myDate =new Date();
        private Ticket objTicket;

        public ReservationBuilder()
        {}

        public ReservationBuilder MyDate(Date myDate) {
            this.myDate=myDate;
            return this;
        }
        public ReservationBuilder objTicket(Ticket objTicket)
        {
            this.objTicket=objTicket;
            return this;
        }
        public SeatReservation build()
        {
            return new SeatReservation(this);
        }
        public ReservationBuilder copy(SeatReservation objseatReserv)
        {
            this.myDate=objseatReserv.myDate;
            this.objTicket=objseatReserv.objTicket;
            return  this;
        }
    }
}

package com.busBooking;

import java.util.*;

/**
 * Hello world!
 *
 */
public class RunBooking
{
    public static void main( String[] args )
    {
        Ticket objTicket = new Ticket(100,10.1);
        Ticket objTicket2 = new Ticket(200,5.0);
        Date today= new Date();
        ReservationFactory objFactory =  ReservationFactory.getInstnce();

        SeatReservation.ReservationBuilder objbuilder = new SeatReservation.ReservationBuilder();
        SeatReservation objSeatReserv2 = objFactory.create(today,objTicket2);


        System.out.println("Printing using factory");
        System.out.println("Date: "+objSeatReserv2.getMyDate()+"    \nTicket Number: "
                +objSeatReserv2.getObjTicket().getTicketNumber()+"     \nPrice: "
                + objSeatReserv2.getObjTicket().amountDue());

        //using builder
        System.out.println("\n\nPrinting using Builder");
        SeatReservation objSeatReserv =objbuilder.MyDate(today)
                .objTicket(objTicket)
                .build();

        System.out.println("Date  "+ objSeatReserv.getMyDate()+"    \nTicket number: "
                +objSeatReserv.getObjTicket().getTicketNumber()
                +"  \nPrice"+ objSeatReserv.getObjTicket().amountDue() );
    }
}

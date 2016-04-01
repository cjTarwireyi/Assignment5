package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public class Ticket implements Cost {
    private Double goodsWeight;
    private int ticketNumber;
    public Ticket(int ticketNumber,Double goodsWeight)
    {
        this.ticketNumber=ticketNumber;
        this.goodsWeight=goodsWeight;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public Double amountDue() {

        return goodsWeight*5+700.00;
    }
}

package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public class SeatStatus {
   private boolean available;
    public SeatStatus(boolean available){this.available=available;}

    public boolean isAvailable() {
        return available;
    }
}

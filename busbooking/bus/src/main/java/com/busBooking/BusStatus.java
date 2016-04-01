package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public class BusStatus {
    private String currentState;
    public BusStatus(String currentState){this.currentState=currentState;}

    public String getCurrentState() {
        return currentState;
    }
}

package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public class Driver extends AbstractEmployee {
    public  Driver (int level)
    {
        this.level=level;
    }
    @Override
    protected void AssignEmployee(String title ,String name) {

        System.out.println("This is a "+title+"\nName: "+name);
    }
}

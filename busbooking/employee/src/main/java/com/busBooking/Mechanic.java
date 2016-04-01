package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public class Mechanic extends AbstractEmployee {
    public Mechanic(int level)
    {
        this.level=level;
    }
    @Override
    protected void AssignEmployee(String title,String name) {

        System.out.println("This is a "+title+"\nName: "+name);
    }
}

package com.busBooking;

/**
 * Created by student on 2016/04/03.
 */
public class MaintainanceFactory {
    Maintainance makeFactory(String desc, double amount)
    {
        return  new Maintainance(desc,amount);
    }
}

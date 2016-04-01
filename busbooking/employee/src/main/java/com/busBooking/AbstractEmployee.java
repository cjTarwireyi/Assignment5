package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public abstract class AbstractEmployee {
    public static  int DRIVER=1;
    public static int MECHANIC=2;
    protected AbstractEmployee nextEmloyee;
    protected int level;

    public void setNextEmloyee(AbstractEmployee nextEmloyee)
    {
        this.nextEmloyee=nextEmloyee;
    }
    public void manageChain( String title, String name,int level)
    {
        if(this.level<=level) {
            AssignEmployee(title,name);
        }
        if(nextEmloyee!=null)
        {
            nextEmloyee.manageChain(title,name,level);
        }
    }
    protected abstract void AssignEmployee(String title ,String name);




}

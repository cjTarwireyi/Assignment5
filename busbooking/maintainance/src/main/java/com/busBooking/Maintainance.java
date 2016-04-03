package com.busBooking;

/**
 * Created by student on 2016/04/03.
 */
public class Maintainance implements Cost{
    private    String description;
    private double  cost;
    public  Maintainance(){}
    public Maintainance(String description,double cost)
    {
        this.description=description;
        this.cost=cost;
    }
    private Maintainance(BuildMaintainance objBuilder)
    {
        this.description=objBuilder.description;
        this.cost=objBuilder.cost;
    }

    public String getDescription() {
        return description;
    }

    public double amountDue() {
        return cost;
    }
    public static class BuildMaintainance
    {
        private    String description;
        private double  cost;
        public BuildMaintainance(){}

        public BuildMaintainance getDescription(String description)
        {
            this.description=description;
                    return this;
        }
        public BuildMaintainance amountDue  (double cost)
        {
            this.cost=cost;
                    return this;
        }

        public Maintainance build()
        {
            return new Maintainance( this);
        }
        public BuildMaintainance copy(Maintainance objMaintainance)
        {
                    this.description=objMaintainance.description;
                    this.cost=objMaintainance.cost;
                    return this;

        }


    }
}

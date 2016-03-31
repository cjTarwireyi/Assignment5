package com.busBooking;

/**
 * Created by student on 3/31/16.
 */
public class Passenger {
    private String name;
    private String idNum;
    private Contact objContact ;

    public Passenger(String name,String idNum,Contact objContact) {
       this.objContact=objContact;
        this.idNum=idNum;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }
    public Contact getContact()
    {
        return objContact;
    }
    private Passenger(PassengerBuilder builder)
    {
        this.idNum=builder.idNum;
        this.name=builder.name;
        this.objContact=builder.objContact;

    }
    public static class PassengerBuilder {
        private String name;
        private String idNum;
        private Contact objContact ;
        public PassengerBuilder()
        {

        }
        public PassengerBuilder name(String name)
        {
            this.name=name;

            return this;
        }
        public PassengerBuilder idNum(String idNum)
        {
            this.idNum=idNum;
            return this;
        }
        public PassengerBuilder objContact(Contact objContact)
        {
            this.objContact=objContact;
            return this;
        }
        public Passenger build()
        {
            return new Passenger(this);
        }
        public PassengerBuilder copy(Passenger objValue)
        {
            this.idNum=objValue.idNum;
            this.name=objValue.name;
            this.objContact=objValue.objContact;
            return  this;
        }
    }


}

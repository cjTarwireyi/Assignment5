package com.busBooking;

/**
 * Created by student on 3/31/16.
 */
public class Contact {
    private String address;
    private String postalCode;
    private String phoneNum;
    public Contact(String address,String postalCode,String phoneNum)
    {
        this.address=address;
        this.postalCode=postalCode;
        this.phoneNum=phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}

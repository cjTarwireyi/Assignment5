package com.busBooking;

/**
 * Hello world!
 *
 */
public class RunFactory
{
    public static void main( String[] args )
    {
        PassengerFactory objFactory = new PassengerFactory();

        Contact objContact = new Contact("199 muizenberg","7945","021451278");
        Passenger.PassengerBuilder b= new Passenger.PassengerBuilder();
        Passenger objPassenger =  objFactory.create("Cornelious","1515151551",objContact);
        //System.out.println( objPassenger.getIdNum()+"    "+objPassenger.getContact().getAddress() );

        Passenger objBuilder = b.idNum("4561")
                                    .name("Junior")
                                    .objContact(objContact)
                                    .build();
       // Passenger objBuildPassenger =  objBuilder.build();
        System.out.println( objBuilder.getName() + "  "+objBuilder.getContact().getAddress() );


    }
}

package com.busBooking;

/**
 * Hello world!
 *
 */
public class RunFactory
{
    public static void main( String[] args )
    {
        PassengerFactory objFactory = PassengerFactory.getInstance();

        Contact objContact = new Contact("199 muizenberg","7945","021451278");
        Passenger.PassengerBuilder objBuild = new Passenger.PassengerBuilder();
        Passenger objPassenger =  objFactory.create("Cornelious","1515151551",objContact);

        System.out.println("Printing using factory method");
        System.out.println( objPassenger.getIdNum()+"  "+objPassenger.getName()+"    "+objPassenger.getContact().getAddress() +"   "+objPassenger.getContact().getPostalCode()
        +"  "+objPassenger.getContact().getPhoneNum());

        System.out.println("\n\nPrinting using builder");
        Passenger objBuildPassenger = objBuild.idNum("4561")
                                    .name("Junior")
                                    .objContact(objContact)
                                    .build();
       // Passenger objBuildPassenger =  objBuildPassenger.build();
        System.out.println( objBuildPassenger.getName() + "  "+ objBuildPassenger.getContact().getAddress() );


    }
}

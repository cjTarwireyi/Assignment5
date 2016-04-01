package com.busBooking;

/**
 * Hello world!
 *
 */
public class RunBusApp
{
    public static void main( String[] args )

    {
       //using factor and singleton
        System.out.println("Using fatory");
        BusStatus objBusStatus2 = new BusStatus("onroad");
        BusFactory objBusFactory = BusFactory.getInstance();
        Bus objBus= objBusFactory.create("124",objBusStatus2);
        System.out.println("Number Plate: "+objBus.getNumberPlate()+"\nStatus:  "+objBus.getObjBusStatus().getCurrentState()+"\n\n");

       //using builder
        System.out.println("using Builder");
        Bus.BusBuilder objBuild = new Bus.BusBuilder();
        BusStatus objBusStatus = new BusStatus("full");
        Bus objBuildBus= objBuild.getnumberPlate("123")
                .getObjBusStatus(objBusStatus)
                .build();
        System.out.println("Number Plate  " +objBuildBus.getNumberPlate()+"\n Status  "+objBuildBus.getObjBusStatus().getCurrentState() );
    }
}

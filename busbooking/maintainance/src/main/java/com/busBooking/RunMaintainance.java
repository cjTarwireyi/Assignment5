package com.busBooking;

/**
 * Hello world!
 *
 */
public class RunMaintainance
{
    public static void main( String[] args )
    {
        System.out.println("print using Builder");
        Maintainance.BuildMaintainance objMaintainanceBuilder = new Maintainance.BuildMaintainance();
        Maintainance objBuild = objMaintainanceBuilder.getDescription("Wheels")
                .amountDue(5000)
                .build();
        System.out.println(objBuild.getDescription()+"  R"+objBuild.amountDue() );

        System.out.println("\nprint using factory \n");
        MaintainanceFactory objFactory = new MaintainanceFactory();
        Maintainance objMantaininance = objFactory.makeFactory("CV joints",1000);
        System.out.println(objMantaininance.getDescription()+"  R"+ objMantaininance.amountDue());

    }
}

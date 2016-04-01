package com.busBooking;

/**
 * Hello world!
 *
 */
public class RunEmployees
{
    private static AbstractEmployee createChain()
    {
        AbstractEmployee objDriver= new Driver(AbstractEmployee.DRIVER);
        AbstractEmployee objMechanic = new Mechanic(AbstractEmployee.MECHANIC);
        objDriver.setNextEmloyee(objMechanic);

        return objDriver;
    }
    public static void main( String[] args )
    {
        AbstractEmployee objEmployee= createChain();

        objEmployee.manageChain("Driver","Cornelious",AbstractEmployee.DRIVER);
        objEmployee.manageChain("Mechanic","Junior",AbstractEmployee.MECHANIC);

    }
}

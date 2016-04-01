package com.busBooking;

/**
 * Created by student on 4/1/16.
 */
public class Bus {
    private String numberPlate;
    private BusStatus objBusStatus;
    private Seat objSeat;
    private SeatStatus objSeatStatus;

    public  Bus(String numberPlate,BusStatus objBusStatus)
    {
        this.numberPlate=numberPlate;
        this.objBusStatus=objBusStatus;

    }
    private Bus(BusBuilder objBuilder)
    {
        this.numberPlate=objBuilder.numberPlate;
        this.objBusStatus=objBuilder.objBusStatus;
    }
    public String getNumberPlate() {
        return numberPlate;
    }

    public BusStatus getObjBusStatus() {
        return objBusStatus;
    }

    public static class BusBuilder
    {
        private String numberPlate;
        private BusStatus objBusStatus;

        public BusBuilder getnumberPlate(String numberPlate)
        {
            this.numberPlate=numberPlate;
            return this;
        }
        public BusBuilder getObjBusStatus(BusStatus objBusStatus)
        {
            this.objBusStatus=objBusStatus;
            return this;
        }
        public  Bus build()
        {
            return new Bus (this);
        }
        public BusBuilder copy(Bus objBus)
        {
            this.numberPlate=objBus.numberPlate;
            this.objBusStatus=objBus.objBusStatus;
            return this;
        }


    }
}

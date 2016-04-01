package com.busBooking;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 4/1/16.
 */
public class TestBus {
    private BusFactory objBusFactory;
    private BusStatus objBusStatus;
    @Before
    public void setUp() throws Exception {

        objBusFactory= BusFactory.getInstance();
        objBusStatus=new BusStatus("onroad");
    }

    @Test
    public void testObjectCreation() throws Exception {
        Bus objBus = objBusFactory.create("123",objBusStatus);

        Assert.assertEquals(objBus.getNumberPlate(),"123");
        Assert.assertSame(objBus.getObjBusStatus(),objBusStatus);
    }

    @Test
    public void testObjectUpdate() throws Exception {
        Bus objBus = objBusFactory.create("123",objBusStatus);

        Assert.assertEquals(objBus.getNumberPlate(),"123");
        Assert.assertSame(objBus.getObjBusStatus(),objBusStatus);

        Bus objBuildBus = new Bus.BusBuilder().getnumberPlate("123")
                .getObjBusStatus(objBusStatus)
                .build();
        Assert.assertEquals(objBuildBus.getNumberPlate(),objBus.getNumberPlate());
        Assert.assertEquals(objBuildBus.getObjBusStatus(),objBus.getObjBusStatus());

    }
}

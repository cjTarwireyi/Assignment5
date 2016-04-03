package com.busBooking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2016/04/03.
 */
public class TestMaintainance {
   private MaintainanceFactory objMaintainance;
    @Before
    public void setUp() throws Exception {
        objMaintainance = new MaintainanceFactory();

    }

    @Test
    public void testObjectCreation() throws Exception {
        Maintainance objMaintain = objMaintainance.makeFactory("wheels",2000.00);
        Assert.assertEquals(objMaintain.getDescription(),"wheels");
        Assert.assertNotEquals(objMaintain,objMaintainance);

    }

    @Test
    public void testUpdate() throws Exception {
        Maintainance objMaintain = objMaintainance.makeFactory("wheels",2000.00);
        Assert.assertEquals(objMaintain.getDescription(),"wheels");


    }
}

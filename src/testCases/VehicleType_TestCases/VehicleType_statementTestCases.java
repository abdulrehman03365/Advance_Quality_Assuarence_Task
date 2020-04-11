package VehicleType_TestCases;

import code.DateTime;
import code.VehicleType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleType_statementTestCases {
    VehicleType vehicleType;
    DateTime LastMaintenance;



    @Before
    public  void Vehicle()
    {


    }


    @Before
    public void setUp() throws Exception {
        LastMaintenance = new DateTime(4,4,2020);
        vehicleType =new VehicleType(5);
        vehicleType = new VehicleType(5,LastMaintenance);

    }


    @Test
    public void getCarSeats() {
        Assert.assertEquals(0,vehicleType.getCarSeats());
    }

    @Test
    public void setCarSeats() {
        vehicleType.setCarSeats(5);
        Assert.assertEquals(5,vehicleType.getCarSeats());
    }




    @Test
    public void getLastMaintenance() {
        Assert.assertEquals(LastMaintenance,vehicleType.getLastMaintenance());
    }

    @Test
    public void setLastMaintenance() {
    vehicleType.setLastMaintenance(LastMaintenance);
    Assert.assertEquals(LastMaintenance,vehicleType.getLastMaintenance());

    }

    @Test
    public void canBeRentedForMinimumDays() {

    }

    @Test
    public void isUnderMaintenance() {

    }



}
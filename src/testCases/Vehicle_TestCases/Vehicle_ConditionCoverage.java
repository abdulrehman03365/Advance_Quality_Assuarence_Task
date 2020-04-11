package Vehicle_TestCases;

import code.DateTime;
import code.Vehicle;
import code.VehicleType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vehicle_ConditionCoverage {
    Vehicle vehicle;
    VehicleType vehicleType;
    DateTime LastMaintenance,rentDate;


    @Before
    public  void Setup()
    {
        LastMaintenance = new DateTime(4,4,2020);
        rentDate = new DateTime(5,4,2020);
        vehicleType =new VehicleType(5);
        vehicleType = new VehicleType(5,LastMaintenance);
        vehicle = new Vehicle("car",2018,"2017", "mehran", 1, vehicleType);
    }

    @Test
    public void rent() {
       Assert.assertEquals(false ,vehicle.rent("car123",  rentDate,16));
        Assert.assertEquals(true ,vehicle.rent("van",  rentDate,16));

  }

    @Test
    public void performMaintenance() {
Assert.assertEquals(false,vehicle.performMaintenance());
        vehicle = new Vehicle("car",2018,"2017", "mehran", 3, vehicleType);

        Assert.assertEquals(true,vehicle.performMaintenance());
    }

    @Test
    public void testToString() {
    }

    @Test
    public void getDetails() {
    }
}
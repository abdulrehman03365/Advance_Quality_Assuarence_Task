package Vehicle_TestCases;

import code.DateTime;
import code.Vehicle;
import code.VehicleType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vehicle_StatementCoverage {
Vehicle vehicle;
VehicleType vehicleType;
DateTime LastMaintenance,startDate,endDate;

@Before
public void setup(){
    LastMaintenance = new DateTime(4,4,2020);
    vehicleType =new VehicleType(5);
    vehicleType = new VehicleType(5,LastMaintenance);
    vehicle = new Vehicle("car",2018,"2017", "mehran", 1, vehicleType);
startDate = new DateTime(4,4,2020);
endDate = new DateTime(6,4,2020);


}
    @Test
    public void getVehicleId() {
        Assert.assertEquals("car",vehicle.getVehicleId());


}



    @Test
    public void getLastElementIndex() {
Assert.assertEquals(-1,vehicle.getLastElementIndex());
}
}
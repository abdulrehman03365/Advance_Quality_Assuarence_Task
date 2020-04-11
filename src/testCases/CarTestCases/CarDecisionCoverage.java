package CarTestCases;

import code.Car;
import code.DateTime;
import code.VehicleType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarDecisionCoverage {
   code.Car Car;
   VehicleType vehicleType;
   DateTime Lastmaintenance,endDate,startDate;
   @Before
   public  void setup()
   {
       Lastmaintenance = new DateTime(4,4,2020);
       vehicleType =new VehicleType(5);
       vehicleType = new VehicleType(5,Lastmaintenance);
       endDate = new DateTime(4,5,2020);
       startDate = new DateTime(4,6,2020);
     Car= new  Car("Car", 2017, "2015", "Mehran", 1,  vehicleType);
   }

    @Test
    public void getLateFee() {

  double Latefee= Car.getLateFee(endDate,startDate);
   double exp =0.00;
        assertEquals(exp, Latefee,0.00);

   }



    @Test
    public void completeMaintenance() {

       Assert.assertFalse(Car.completeMaintenance());
       Assert.assertTrue(Car.completeMaintenance());

    }


}
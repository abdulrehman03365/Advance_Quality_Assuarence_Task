package VehicleType_TestCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import code.Car;
import code.DateTime;
import code.Vehicle;
import code.VehicleType;

public class VehicleType_ConditionCoverage {

	Vehicle vehicle;
	VehicleType vehicleType;
	DateTime dateTime,rentDate,Lastmaintainance;

    Car car;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {

		    dateTime = new DateTime(4,4,2020);
		    vehicle=  new Vehicle("Car",2020,"japan","mehran",2,vehicleType);
            rentDate= new DateTime(6,4,2020);
            Lastmaintainance = new DateTime(5,3,2020);
	       vehicleType = new VehicleType(5,Lastmaintainance);
	       vehicleType = new VehicleType(3);
	}





	@Test
	public void getSeats() {
		Assert.assertEquals(3,	vehicleType.getSeats("car"));
		Assert.assertEquals(15,vehicleType.getSeats("van"));

	}


	@Test
	public void canBeRentedForMinimumDays()
	{



			Assert.assertEquals(3,vehicleType.canBeRentedForMinimumDays(dateTime,"car"));

			dateTime = new DateTime(1,1,2020);
		Assert.assertEquals(2,vehicleType.canBeRentedForMinimumDays(dateTime,"car"));
		Assert.assertEquals(1,vehicleType.canBeRentedForMinimumDays(dateTime,"van"));

	}



}

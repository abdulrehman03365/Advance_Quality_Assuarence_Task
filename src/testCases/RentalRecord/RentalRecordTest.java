package RentalRecord;

import code.DateTime;
import code.RentalRecord;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalRecordTest {
    RentalRecord rentalRecord;
    DateTime rentDate, DateTime, EstimatedReturnDate;
    DateTime ActualDate;
    Double RentalFee=240.00, LateFee= 100.00;

    @Before
    public void SetUp() {
        DateTime = new DateTime();
        rentDate = new DateTime(4, 4, 2020);
        EstimatedReturnDate = new DateTime(6, 6, 2020);
        Double RentalFee=240.00, LateFee= 100.00;
        rentalRecord = new RentalRecord("1122", rentDate, EstimatedReturnDate);
  //      rentalRecord.setData(ActualDate, RentalFee, LateFee);
        ActualDate = new DateTime(6, 6, 2020);

    }

    @Test
    public void setData() {
        rentalRecord.setData(ActualDate, RentalFee, LateFee);


    }

    @Test
    public void getEstimatedReturnDate() {
    Assert.assertEquals(EstimatedReturnDate,rentalRecord.getEstimatedReturnDate());
    }

    @Test
    public void getRentDate() {
        Assert.assertEquals(rentDate,rentalRecord.getRentDate());

    }

    @Test
    public void testToString() {

    }


}
package RentalRecord;

import code.DateTime;
import code.RentalRecord;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RentalRecord_ConditionCoverage {
    RentalRecord rentalRecord;
    code.DateTime rentDate, DateTime, EstimatedReturnDate;
    DateTime ActualDate;
    String rentId;
    Double rentalFee=240.00, LateFee = 120.00;

    @Before
    public void SetUp() {
        DateTime = new DateTime();
        rentDate = new DateTime(4, 4, 2020);
        EstimatedReturnDate = new DateTime(6, 6, 2020);

        rentId="1122";
        rentalRecord = new RentalRecord("1122", rentDate, EstimatedReturnDate);
        //      rentalRecord.setData(ActualDate, RentalFee, LateFee);
        ActualDate = new DateTime(6, 6, 2020);

    }


    @Test
    public  void ToString()
    {
        String data = this.rentId+":"+this.rentDate.toString()+":"+this.EstimatedReturnDate.toString()+":none:none:none";
        Assert.assertEquals(data,rentalRecord.toString());
        ActualDate = new DateTime(6, 6, 2020);
        rentalRecord.setData(ActualDate,240.00,120.00);
        String
        data1=this.rentId+":"+this.rentDate.toString()+":"+this.EstimatedReturnDate.toString()+":"+this.ActualDate.toString()
                +":"+this.rentalFee.toString()+":"+this.LateFee.toString();
       // Assert.assertEquals(data1,toString());

    }

    @Test
    public  void  geDetails()
    {
        String data= "Record ID:             " + this.rentId
                + "\nRent Date:             " + this.rentDate.toString()
                + "\nEstimated Return Date: " + this.EstimatedReturnDate.toString();

        Assert.assertEquals(data,rentalRecord.getDetails());

        ActualDate = new DateTime(6, 6, 2020);
        rentalRecord.setData(ActualDate,240.00,120.00);

           String data2 =  "Record ID:             " + rentId
                + "\nRent Date:             " + rentDate.toString()
                + "\nEstimated Return Date: " + EstimatedReturnDate.toString()
                + "\nActual Return Date:    "+ActualDate.toString()
                + "\nRental Fee:            "+String.format ("%.2f",rentalFee )+
                "\nLate Fee:              "+String.format("%.2f",this.LateFee);

        Assert.assertEquals(data2,rentalRecord.getDetails());

    }





}

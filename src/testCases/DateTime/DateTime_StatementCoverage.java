package DateTime;

import code.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.*;

public class DateTime_StatementCoverage {
DateTime dateTime;



    @Before
    public void setUp() throws Exception {
        dateTime = new DateTime();
        dateTime = new DateTime(Calendar.DAY_OF_MONTH,Calendar.MONTH,Calendar.YEAR);

    }

    @Test
    public void getTime() {

    }

    @Test
    public void getNameOfDay(){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

    }

    @Test
    public void testToString() {


    }

    @Test
    public void getCurrentTime() {
    }

    @Test
    public void getFormattedDate() {
    }

    @Test
    public void getEightDigitDate() {
    }

    @Test
    public void diffDays() {
    }

    @Test
    public void setAdvance() {
    }
}
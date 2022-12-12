package testExample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.GregorianCalendar;

class TestCalendar {

    @ParameterizedTest
    @ValueSource(ints = {1908, 1912, 1924, 1972, 2000})
    void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        
        Calendar calendar = new Calendar(year);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        Boolean expectedValue = gregorianCalendar.isLeapYear(year);
        Boolean actualValue = calendar.isLeapYear();

        assertEquals(expectedValue, actualValue);

    }


    

}

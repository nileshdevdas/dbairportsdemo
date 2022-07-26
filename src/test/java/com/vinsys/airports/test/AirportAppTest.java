package com.vinsys.airports.test;

import com.vinsys.airports.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test
 * 1. Gives me gurantee what i deliver is what was asked
 * 2. I can refactor change and validate my code as required
 * 3. Test first allows me to get guaranteed  result as it will validated all the requirements
 * 4. If there is a defect its faster to find because i a specific test will fail
 * 5. impact analysis is easier to find as changes will break test and we can find the impacts
 * 6. percentage completion of work is possible when we deliver the code as number test case passed identifies the compltion
 * 7. if you write test cases you will also get coverage report
 * 8. Test cases are undestanding of your requirement which proves you understood what has to be delivered
 */
public class AirportAppTest {
    IAirportApp app;


    @Test
    void testFindAirportsByNameInvalidInput() throws Exception {
        IAirportApp app = new AirportAppImpl();
        assertThrows(InvalidInputException.class, () -> {
            app.findAirportsByName(null);
        });
    }

    @Test
    void testFindAirportsByNameValidInputChars() throws Exception {
        String regex = "[A-Z a-z 0-9]";
        // regex
        // this method sh\ould throw exception
        // when you call this method it should throws InvalidInputException if
        // the input is null
        //  app.findAirportsByName(null);
        fail("not yet implemented");
    }

    @Test
    void testFindAirportsByNameAirportFound() throws Exception {
        IAirportApp app = new AirportAppImpl();
        assertTrue(app.findAirportsByName("Shivaji").size() > 0);
    }

    @Test
    void testFindAirportByNameAirportNotFound() {
        IAirportApp app = new AirportAppImpl();
        assertThrows(AirportNotFoundException.class, () -> {
            app.findAirportsByName("93809820938adhlkjzhkjahfdska");
        });
    }
}

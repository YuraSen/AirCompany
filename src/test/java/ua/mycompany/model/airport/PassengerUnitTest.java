package ua.mycompany.model.airport;

import org.junit.Before;
import org.junit.Test;
import ua.mycompany.model.PassengerPlane;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PassengerUnitTest {
    private PassengerUnit passengerUnit;

    @Before
    public void setUp() {
        PassengerPlane passengerPlaneOne = new PassengerPlane(100, 10, 50);
        PassengerPlane passengerPlaneTwo = new PassengerPlane(100, 10, 60);
        passengerUnit = new PassengerUnit();
        passengerUnit.addPassengerPlanes(passengerPlaneOne);
        passengerUnit.addPassengerPlanes(passengerPlaneTwo);
    }

    @Test
    public void sumOfCapacity() {
        double actual = passengerUnit.sumOfCapacity();
        assertThat(actual, is(110.0));
    }
}

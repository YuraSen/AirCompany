package ua.mycompany.model.airport;

import org.junit.Before;
import org.junit.Test;
import ua.mycompany.model.CargoPlane;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CargoUnitTest {
    private CargoUnit cargoUnit;

    @Before
    public void setUp() {
        CargoPlane cargoPlaneOne = new CargoPlane(100, 10, 200);
        CargoPlane cargoPlaneTwo = new CargoPlane(100, 10, 300);
        cargoUnit = new CargoUnit();
        cargoUnit.addCargoPlanes(cargoPlaneOne);
        cargoUnit.addCargoPlanes(cargoPlaneTwo);
    }

    @Test
    public void sumOfCarrying() {
        double actual = cargoUnit.sumOfCarrying();
        assertThat(actual, is(500.0));
    }
}

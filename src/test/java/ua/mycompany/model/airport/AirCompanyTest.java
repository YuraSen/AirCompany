package ua.mycompany.model.airport;

import org.junit.Before;
import org.junit.Test;
import ua.mycompany.model.CargoPlane;
import ua.mycompany.model.PassengerPlane;
import ua.mycompany.model.Plane;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AirCompanyTest {
    private AirCompany airCompany;
    private CargoPlane cargoPlaneOne;
    private CargoPlane cargoPlaneTwo;
    private PassengerPlane passengerPlaneOne;
    private PassengerPlane passengerPlaneTwo;

    @Before
    public void setUp() {
        cargoPlaneOne = new CargoPlane(1900, 10, 200);
        cargoPlaneTwo = new CargoPlane(500, 30, 300);
        passengerPlaneOne = new PassengerPlane(1000, 15, 50);
        passengerPlaneTwo = new PassengerPlane(300, 40, 60);
        airCompany = new AirCompany();
        airCompany.addCargoPlanes(cargoPlaneOne);
        airCompany.addCargoPlanes(cargoPlaneTwo);
        airCompany.addPassengerPlanes(passengerPlaneOne);
        airCompany.addPassengerPlanes(passengerPlaneTwo);
    }

    @Test
    public void sortByDistance() {
        List<Plane> actual = airCompany.sortByDistance();
        List<Plane> expected = new ArrayList<>();
        expected.add(passengerPlaneTwo);
        expected.add(cargoPlaneTwo);
        expected.add(passengerPlaneOne);
        expected.add(cargoPlaneOne);
        assertThat(actual, is(expected));
    }

    @Test
    public void searchElementByFuel() {
        List<Plane> actual = airCompany.searchElementByFuel(0, 20);
        List<Plane> expected = new ArrayList<>();
        expected.add(cargoPlaneOne);
        expected.add(passengerPlaneOne);
        assertThat(actual, is(expected));
    }
}

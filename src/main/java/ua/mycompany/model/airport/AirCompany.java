package ua.mycompany.model.airport;

import ua.mycompany.model.CargoPlane;
import ua.mycompany.model.PassengerPlane;
import ua.mycompany.model.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirCompany {
    private List<Plane> planes;
    private CargoUnit cargoUnit;
    private PassengerUnit passengerUnit;

    public AirCompany() {
        planes = new ArrayList<>();
        cargoUnit = new CargoUnit();
        passengerUnit = new PassengerUnit();
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void addPassengerPlanes(PassengerPlane passengerPlane) {
        passengerUnit.addPassengerPlanes(passengerPlane);
        add(passengerPlane);
    }

    public void addCargoPlanes(CargoPlane cargoPlane) {
        cargoUnit.addCargoPlanes(cargoPlane);
        add(cargoPlane);
    }

    private void add(Plane plane) {
        planes.add(plane);
    }

    public List<Plane> sortByDistance() {
        Collections.sort(planes);
        return planes;
    }

    public List<Plane> searchElementByFuel(double startRange, double endRange) {
        List<Plane> searchElementFuel = new ArrayList<>();
        for (Plane element : planes) {
            if (element.getStockOfFuel() > startRange && element.getStockOfFuel() < endRange) {
                searchElementFuel.add(element);
            }
        }
        return searchElementFuel;
    }

    public double sumOfCarryingCargoPlane(){
        return cargoUnit.sumOfCarrying();
    }

    public double sumOfCapacityPassengerPlane(){
        return passengerUnit.sumOfCapacity();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("AirCompany{ planes= ");
        for (Plane plane : planes) {
            result.append(plane.toString());
        }
        result.append('}');
        return result.toString();
    }
}

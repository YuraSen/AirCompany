package ua.mycompany.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirCompany {
    private List<Plane> planes;

    public AirCompany() {
        planes = new ArrayList<>();
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void add(Plane plane) {
        planes.add(plane);
    }

    public List<Plane> sortByDistance() {
        Collections.sort(planes);
        return planes;
    }

    public double sumOfCapacity() {
        double sum = 0;
        for (Plane element : planes) {
            sum += element.getCapacity();
        }
        return sum;
    }

    public double sumOfCarrying() {
        double sum = 0;
        for (Plane element : planes) {
            sum += element.getCarrying();
        }
        return sum;
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

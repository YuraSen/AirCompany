package ua.mycompany.model;

import java.util.ArrayList;
import java.util.Collections;

public class AirCompany {
    private ArrayList<Plane> planes;

    public AirCompany() {
        planes = new ArrayList<>();
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void add(Plane plane) {
        planes.add(plane);
    }

    public ArrayList<Plane> sortByDistance() {
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

    public double sumOfCarring() {
        double sum = 0;
        for (Plane element : planes) {
            sum += element.getCapacity();
        }
        return sum;
    }

    public ArrayList<Plane> searchElementByFuel(double startRange, double endRange) {
        ArrayList<Plane> searchElementFuel = new ArrayList<>();
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

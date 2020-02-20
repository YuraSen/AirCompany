package ua.mycompany.model.airport;

import ua.mycompany.model.PassengerPlane;

import java.util.ArrayList;
import java.util.List;

public class PassengerUnit {
    List<PassengerPlane> passengerPlanes;

    public PassengerUnit() {
        passengerPlanes = new ArrayList<>();
    }

    public void addPassengerPlanes(PassengerPlane passengerPlane) {
        passengerPlanes.add(passengerPlane);
    }

    public double sumOfCapacity() {
        double sum = 0;
        for (PassengerPlane element : passengerPlanes) {
            sum += element.getCapacity();
        }
        return sum;
    }
}

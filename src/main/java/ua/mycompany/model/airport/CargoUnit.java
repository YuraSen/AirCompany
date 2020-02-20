package ua.mycompany.model.airport;

import ua.mycompany.model.CargoPlane;

import java.util.ArrayList;
import java.util.List;

public class CargoUnit {
    List<CargoPlane> cargoPlanes;

    public CargoUnit() {
        cargoPlanes = new ArrayList<>();
    }

    public void addCargoPlanes(CargoPlane cargoPlane) {
        cargoPlanes.add(cargoPlane);
    }

    public double sumOfCarrying() {
        double sum = 0;
        for (CargoPlane element : cargoPlanes) {
            sum += element.getCarrying();
        }
        return sum;
    }
}

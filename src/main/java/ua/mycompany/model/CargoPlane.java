package ua.mycompany.model;

public class CargoPlane extends Plane {

    public CargoPlane(double distance, double capacity, double carrying, double stockOfFuel) {
        super(distance, capacity, carrying, stockOfFuel);
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "distance=" + distance +
                ", capacity=" + capacity +
                ", carrying=" + carrying +
                ", stockOfFuel=" + stockOfFuel +
                '}';
    }
}

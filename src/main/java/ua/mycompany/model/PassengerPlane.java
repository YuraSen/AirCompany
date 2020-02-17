package ua.mycompany.model;

public class PassengerPlane extends Plane {

    public PassengerPlane(double distance, double capacity, double carrying, double stockOfFuel) {
        super(distance, capacity, carrying, stockOfFuel);
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "distance=" + distance +
                ", capacity=" + capacity +
                ", carrying=" + carrying +
                ", stockOfFuel=" + stockOfFuel +
                '}';
    }
}

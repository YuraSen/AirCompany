package ua.mycompany.model;

public class PassengerPlane extends Plane {

    private final double capacity;

    public PassengerPlane(double distance, double stockOfFuel, double capacity) {
        super(distance, stockOfFuel);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "distance=" + distance +
                ", capacity=" + capacity +
                ", stockOfFuel=" + stockOfFuel +
                '}';
    }
}

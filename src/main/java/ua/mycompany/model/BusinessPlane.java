package ua.mycompany.model;

public class BusinessPlane extends Plane {

    public BusinessPlane(double distance, double capacity, double carrying, double stockOfFuel) {
        super(distance, capacity, carrying, stockOfFuel);
    }

    @Override
    public String toString() {
        return "BusinessPlane{" +
                "distance=" + distance +
                ", capacity=" + capacity +
                ", carrying=" + carrying +
                ", stockOfFuel=" + stockOfFuel +
                '}';
    }
}

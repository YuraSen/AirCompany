package ua.mycompany.model;

public class CargoPlane extends Plane {

    private final double carrying;

    public CargoPlane(double distance, double stockOfFuel, double carrying) {
        super(distance, stockOfFuel);
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "distance=" + distance +
                ", carrying=" + carrying +
                ", stockOfFuel=" + stockOfFuel +
                '}';
    }
}

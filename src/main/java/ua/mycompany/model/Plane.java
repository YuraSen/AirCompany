package ua.mycompany.model;

public abstract class Plane implements Comparable<Plane> {

    protected final double distance;
    protected final double capacity;
    protected final double carrying;
    protected final double stockOfFuel;

    public Plane(double distance, double capacity, double carrying, double stockOfFuel) {
        this.distance = distance;
        this.capacity = capacity;
        this.carrying = carrying;
        this.stockOfFuel = stockOfFuel;
    }

    public double getDistance() {
        return distance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getStockOfFuel() {
        return stockOfFuel;
    }

    public double getCarrying() {
        return carrying;
    }

    @Override
    public int compareTo(Plane o) {
        return (int) (this.distance - o.distance);
    }
}

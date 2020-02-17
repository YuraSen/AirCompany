package ua.mycompany.model;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Double.compare(plane.distance, distance) == 0 &&
                Double.compare(plane.capacity, capacity) == 0 &&
                Double.compare(plane.carrying, carrying) == 0 &&
                Double.compare(plane.stockOfFuel, stockOfFuel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance, capacity, carrying, stockOfFuel);
    }

    @Override
    public int compareTo(Plane o) {
        return (int) (this.distance - o.distance);
    }
}

package ua.mycompany.model;

public abstract class Plane implements Comparable<Plane> {

    protected final double distance;
    protected final double stockOfFuel;

    public Plane(double distance, double stockOfFuel) {
        this.distance = distance;
        this.stockOfFuel = stockOfFuel;
    }

    public double getDistance() {
        return distance;
    }


    public double getStockOfFuel() {
        return stockOfFuel;
    }

    @Override
    public int compareTo(Plane o) {
        return (int) (this.distance - o.distance);
    }
}

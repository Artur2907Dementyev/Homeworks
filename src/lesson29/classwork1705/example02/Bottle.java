package lesson29.classwork1705.example02;

public class Bottle implements Comparable<Bottle> {
    private Materials material;
    private double liters;

    public Bottle(Materials material, double liters) {
        this.material = material;
        this.liters = liters;
    }

    public Materials getMaterial() {
        return material;
    }

    public double getLiters() {
        return liters;
    }


    @Override
    public int compareTo(Bottle o) {
        if (this.liters > o.liters) {
            return 1;
        } else if (this.liters < o.liters) {
            return -1;
        }
        return 0;
    }
}

package lesson29.classwork1705.HW29;


import java.util.Objects;

public class Girya implements Comparable <Girya>{

    private String material;
    private String color;
    private double weight;

    public Girya(String material, String color, double weight) {
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Girya o) {
        if (this.weight > o.weight) {
            return 1;
        } else if (this.weight < o.weight) {
            return -1;
        }
        return 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(material, color, weight);
    }

    @Override
    public String toString() {
        return "Girya{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

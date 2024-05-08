package lesson24.classwork0605.example01;

import lesson23.classwork0305.example01.Pet;

import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private double price;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "id: " + this.name
                + ", name: " + this.name
                + ", price: " + this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Product) {
            Product p = (Product) o;

            return p.name.equals(this.name)
                    && p.id == this.id
                    && p.price == this.price;
        }
        return false;
    }
}

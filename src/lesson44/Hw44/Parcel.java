package lesson44.Hw44;

import java.time.LocalDateTime;

public class Parcel {
    String departureCity;
    String destinationCity;
    double weight;
    LocalDateTime creationDateTime;

    public Parcel(String departureCity, String destinationCity, double weight, LocalDateTime creationDateTime) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.weight = weight;
        this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString() {
        return "Parcel from " + departureCity + " to " + destinationCity + ", weight: " + weight + "kg, created on " + creationDateTime;
    }
}





package lesson42;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2005, 150000);
        Car car2 = new Car("Volkswagen", 1998, 300000);
        Car car3 = new Car("BMW", 2010, 1000000);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        int totalMileage = 0;
        for (Car car : cars) {
            if (car.getYear() > 1999) {
                totalMileage += car.getMileage();
            }
        }
        System.out.println("Total mileage for newer cars: " + totalMileage);

        Car oldestHighMileageCar = null;
        for (Car car : cars) {
            if (car.getMileage() > 500000) {
                if (oldestHighMileageCar == null || car.getYear() < oldestHighMileageCar.getYear()) {
                    oldestHighMileageCar = car;
                }
            }
        }
        assert oldestHighMileageCar != null;
        System.out.println("Oldest high-mileage car: " + oldestHighMileageCar.getBrand());

        int maxMileage = 0;
        Car maxMileageCar = null;
        for (Car car : cars) {
            if ((car.getBrand().startsWith("V") || car.getBrand().startsWith("W")) && car.getMileage() <= 200000) {
                if (car.getMileage() > maxMileage) {
                    maxMileage = car.getMileage();
                    maxMileageCar = car;
                }
            }
        }
        assert maxMileageCar != null;
        System.out.println("Car with max mileage (V/W): " + maxMileageCar.getBrand());
    }
}

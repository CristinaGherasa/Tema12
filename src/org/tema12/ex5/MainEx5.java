package org.tema12.ex5;

public class MainEx5 {
    public static void main(String[] args) {
        CarShop carShop = new CarShop();


        carShop.addCar(new Car("BMW", 2, 5000, 8000));
        carShop.addCar(new Car("Seat", 1, 8000, 12000));
        carShop.addCar(new Car("BMW", 3, 2000, 5000));
        carShop.addCar(new Car("Mercedes", 2, 9000, 15000));
        carShop.addCar(new Car("Mercedes", 1, 3000, 25000));

        System.out.println("Car count by name: " + carShop.countCarsByName());
        System.out.println("Sum kilometers by name: " + carShop.sumKilometersByName());
        System.out.println("Cars grouped by km range: " + carShop.groupCarsByKmRange());
        System.out.println("Cars grouped by price range: " + carShop.groupCarsByPriceRange());
    }
}

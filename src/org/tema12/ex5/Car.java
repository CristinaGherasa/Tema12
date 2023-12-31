package org.tema12.ex5;

public class Car {
    private String name;
    private int age;
    private int km;
    private double price;

    public Car(String name, int age, int km, double price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}

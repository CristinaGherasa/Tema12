package org.tema12.ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarShop {
    private List<Car> cars;

    public CarShop() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Map<String, Integer> countCarsByName() {
        Map<String, Integer> carCountByName = new HashMap<>();
        for (Car car : cars) {
            carCountByName.put(car.getName(), carCountByName.getOrDefault(car.getName(), 0) + 1);
        }
        return carCountByName;
    }

    public Map<String, Integer> sumKilometersByName() {
        Map<String, Integer> kmSumByName = new HashMap<>();
        for (Car car : cars) {
            kmSumByName.put(car.getName(), kmSumByName.getOrDefault(car.getName(), 0) + car.getKm());
        }
        return kmSumByName;
    }

    public Map<Range, List<Car>> groupCarsByKmRange() {
        Map<Range, List<Car>> carsByKmRange = new HashMap<>();
        for (Car car : cars) {
            Range range = getRangeForKm(car.getKm());
            carsByKmRange.computeIfAbsent(range, k -> new ArrayList<>()).add(car);
        }
        return carsByKmRange;
    }

    public Map<Range, List<Car>> groupCarsByPriceRange() {
        Map<Range, List<Car>> carsByPriceRange = new HashMap<>();
        for (Car car : cars) {
            Range range = getRangeForPrice(car.getPrice());
            carsByPriceRange.computeIfAbsent(range, k -> new ArrayList<>()).add(car);
        }
        return carsByPriceRange;
    }

    private Range getRangeForPrice(double price) {

        if (price >= 0 && price <= 10000) {
            return new Range(0, 10000);
        } else if (price > 10000 && price <= 20000) {
            return new Range(10001, 20000);
        } else {
            return new Range(20001, Integer.MAX_VALUE);
        }
    }

    private Range getRangeForKm(int km) {
        if (km >= 1 && km <= 10000) {
            return new Range(1, 10000);
        }

        return null;
    }

    private static class Range {
        private int start;
        private int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public String toString() {
            return start + " to " + end + " " + (end == Integer.MAX_VALUE ? "and above" : "");
        }
    }

}

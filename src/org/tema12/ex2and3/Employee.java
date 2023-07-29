package org.tema12.ex2and3;

public class Employee extends Person{
    private String company;
    private double salary;

    public Employee(String name, int age, String hairColor, String company, double salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }
}

package org.tema12.ex2and3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainEx2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", 25, "Black"));
        persons.add(new Person("Emma", 30, "Blonde"));
        persons.add(new Person("Michael", 22, "Brown"));
        persons.add(new Person("Sophia", 27, "Red"));
        persons.add(new Person("William", 35, "Black"));

        List<String> personNames = persons.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("List of person names: " + personNames);

        Map<String, Integer> nameToAgeMap = persons.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("Map from person's name to age: " + nameToAgeMap);

        int givenAge = 28;
        List<Person> personsOlderThanGivenAge = persons.stream()
                .filter(person -> person.getAge() > givenAge)
                .collect(Collectors.toList());
        System.out.println("Persons older than " + givenAge + ": " + personsOlderThanGivenAge);

        Map<String, List<String>> hairColorToNamesMap = persons.stream()
                .collect(Collectors.groupingBy(Person::getHairColor, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println("Map from person's hair color to names: " + hairColorToNamesMap);

        Map<Integer, List<Person>> ageToPersonsMap = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("Map from age to list of persons: " + ageToPersonsMap);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25, "Black", "XYZ Corp", 50000));
        employees.add(new Employee("Emma", 30, "Blonde", "ABC Inc", 60000));
        employees.add(new Employee("Michael", 22, "Brown", "XYZ Corp", 55000));
        employees.add(new Employee("Sophia", 27, "Red", "DEF Ltd", 70000));
        employees.add(new Employee("William", 35, "Black", "ABC Inc", 65000));

        double specifiedAmount = 60000;
        List<Person> personsWithHighSalary = employees.stream()
                .filter(employee -> employee.getSalary() > specifiedAmount)
                .collect(Collectors.toList());
        System.out.println("Persons with salaries more than " + specifiedAmount + ": " + personsWithHighSalary);

        Map<String, List<Person>> companyToPersonsMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompany, Collectors.toList()));
        System.out.println("Map from company to persons: " + companyToPersonsMap);

        double totalSalaries = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total sum of all salaries: " + totalSalaries);

        Map<String, Double> companyToTotalSalaryMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompany, Collectors.summingDouble(Employee::getSalary)));

        String companyWithBiggestSalary = companyToTotalSalaryMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Company with the biggest salary: " + companyWithBiggestSalary);





    }
}

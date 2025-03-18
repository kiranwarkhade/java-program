package practice.collection_example;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;

public class EmployeeDetailsCRUD {

    // Employee class with properties
    static class Employee {
        int id;
        String name;
        double salary;
        String address;
        LocalDate dateOfJoining;

        public Employee(int id, String name, double salary, String address, LocalDate dateOfJoining) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.address = address;
            this.dateOfJoining = dateOfJoining;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', salary=" + salary +
                    ", address='" + address + "', dateOfJoining=" + dateOfJoining + "}";
        }
    }

    // List to store employee data
    static List<Employee> employeeList = new ArrayList<>();

    // Create Employee - CRUD Operation
    public static void createEmployee(int id, String name, double salary, String address, LocalDate dateOfJoining) {
        Employee emp = new Employee(id, name, salary, address, dateOfJoining);
        employeeList.add(emp);
        System.out.println("Employee added: " + emp);
    }

    // Read (Find) Employee by ID
    public static Employee findById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.id == id)
                .findFirst()
                .orElse(null);
    }

    // Read All Employees
    public static List<Employee> findAll() {
        return employeeList;
    }

    // Find Employee by Name
    public static List<Employee> findByName(String name) {
        return employeeList.stream()
                .filter(emp -> emp.name.equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // Find Employee by Salary
    public static List<Employee> findBySalary(double salary) {
        return employeeList.stream()
                .filter(emp -> emp.salary == salary)
                .collect(Collectors.toList());
    }

    // Find Employee by Address
    public static List<Employee> findByAddress(String address) {
        return employeeList.stream()
                .filter(emp -> emp.address.equalsIgnoreCase(address))
                .collect(Collectors.toList());
    }

    // Find Employee by Date of Joining
    public static List<Employee> findByDateOfJoining(LocalDate date) {
        return employeeList.stream()
                .filter(emp -> emp.dateOfJoining.isEqual(date))
                .collect(Collectors.toList());
    }

    // Update Employee details
    public static boolean updateEmployee(int id, String name, double salary, String address, LocalDate dateOfJoining) {
        Employee emp = findById(id);
        if (emp != null) {
            emp.name = name;
            emp.salary = salary;
            emp.address = address;
            emp.dateOfJoining = dateOfJoining;
            System.out.println("Employee updated: " + emp);
            return true;
        }
        System.out.println("Employee not found with ID: " + id);
        return false;
    }

    // Delete Employee
    public static boolean deleteEmployee(int id) {
        Employee emp = findById(id);
        if (emp != null) {
            employeeList.remove(emp);
            System.out.println("Employee removed: " + emp);
            return true;
        }
        System.out.println("Employee not found with ID: " + id);
        return false;
    }

    // Main method to test CRUD operations
    public static void main(String[] args) {
        // Create Employees
        createEmployee(1, "John Doe", 50000, "New York", LocalDate.of(2020, 5, 15));
        createEmployee(2, "Jane Smith", 60000, "California", LocalDate.of(2019, 3, 10));
        createEmployee(3, "Sam Brown", 55000, "Texas", LocalDate.of(2021, 7, 25));
        createEmployee(4, "Lucy White", 60000, "Florida", LocalDate.of(2020, 5, 15));

        // Find All Employees
        System.out.println("\nAll Employees: ");
        findAll().forEach(System.out::println);

        // Find Employee by ID
        System.out.println("\nFind Employee by ID (ID=2): ");
        System.out.println(findById(2));

        // Find Employee by Name
        System.out.println("\nFind Employee by Name (Name=John Doe): ");
        findByName("John Doe").forEach(System.out::println);

        // Find Employee by Salary
        System.out.println("\nFind Employee by Salary (Salary=60000): ");
        findBySalary(60000).forEach(System.out::println);

        // Find Employee by Address
        System.out.println("\nFind Employee by Address (Address=Florida): ");
        findByAddress("Florida").forEach(System.out::println);

        // Find Employee by Date of Joining
        System.out.println("\nFind Employee by Date of Joining (Date=2020-05-15): ");
        findByDateOfJoining(LocalDate.of(2020, 5, 15)).forEach(System.out::println);

        // Update Employee Details
        System.out.println("\nUpdating Employee with ID=3: ");
        updateEmployee(3, "Samuel Brown", 58000, "Texas", LocalDate.of(2021, 7, 25));

        // Delete Employee by ID
        System.out.println("\nDeleting Employee with ID=1: ");
        deleteEmployee(1);

        // Final Employee List
        System.out.println("\nFinal Employee List: ");
        findAll().forEach(System.out::println);
    }
}

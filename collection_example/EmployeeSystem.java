package practice.collection_example;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;

public class EmployeeSystem {

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

    // Method to create Employee - CRUD Operation
    public static void createEmployee(Scanner sc) {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.println("Enter Employee Address: ");
        String address = sc.nextLine();
        System.out.println("Enter Date of Joining (yyyy-MM-dd): ");
        String dateStr = sc.nextLine();
        LocalDate dateOfJoining = LocalDate.parse(dateStr);

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

    // Find All Employees
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
    public static boolean updateEmployee(int id, Scanner sc) {
        Employee emp = findById(id);
        if (emp != null) {
            System.out.println("Enter new Name: ");
            emp.name = sc.nextLine();
            System.out.println("Enter new Salary: ");
            emp.salary = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.println("Enter new Address: ");
            emp.address = sc.nextLine();
            System.out.println("Enter new Date of Joining (yyyy-MM-dd): ");
            String dateStr = sc.nextLine();
            emp.dateOfJoining = LocalDate.parse(dateStr);
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

    // Main method to run CRUD operations using the Scanner class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Find Employee by ID");
            System.out.println("3. View All Employees");
            System.out.println("4. Find Employee by Name");
            System.out.println("5. Find Employee by Salary");
            System.out.println("6. Find Employee by Address");
            System.out.println("7. Find Employee by Date of Joining");
            System.out.println("8. Update Employee");
            System.out.println("9. Delete Employee");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    createEmployee(sc);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to find: ");
                    int idToFind = sc.nextInt();
                    Employee emp = findById(idToFind);
                    if (emp != null) {
                        System.out.println(emp);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    System.out.println("All Employees:");
                    findAll().forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Enter Employee Name to find: ");
                    String name = sc.nextLine();
                    findByName(name).forEach(System.out::println);
                    break;
                case 5:
                    System.out.print("Enter Employee Salary to find: ");
                    double salary = sc.nextDouble();
                    findBySalary(salary).forEach(System.out::println);
                    break;
                case 6:
                    System.out.print("Enter Employee Address to find: ");
                    String address = sc.nextLine();
                    findByAddress(address).forEach(System.out::println);
                    break;
                case 7:
                    System.out.print("Enter Date of Joining (yyyy-MM-dd): ");
                    String dateStr = sc.nextLine();
                    LocalDate date = LocalDate.parse(dateStr);
                    findByDateOfJoining(date).forEach(System.out::println);
                    break;
                case 8:
                    System.out.print("Enter Employee ID to update: ");
                    int idToUpdate = sc.nextInt();
                    sc.nextLine(); // consume newline
                    updateEmployee(idToUpdate, sc);
                    break;
                case 9:
                    System.out.print("Enter Employee ID to delete: ");
                    int idToDelete = sc.nextInt();
                    deleteEmployee(idToDelete);
                    break;
                case 10:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10);

        sc.close();
    }
}

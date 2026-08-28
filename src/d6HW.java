package d7;

import java.util.ArrayList;
import java.util.Scanner;

public class d6HW {

    static class Employee {
        String name;
        int age;
        String designation;
        double salary;

        Employee(String name, int age, String designation, double salary) {
            this.name = name;
            this.age = age;
            this.designation = designation;
            this.salary = salary;
        }
    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static boolean exitProgram = false;

    public static void main(String[] args) {
        while (!exitProgram) {
            System.out.println("\n=== Employee Menu ===");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit Program");
            System.out.print("Choice: ");

            int choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1 -> create();
                case 2 -> display();
                case 3 -> raiseSalary();
                case 4 -> exit();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Create employees
    static void create() {
        String again;
        do {
            String name;
            do {
                System.out.print("Enter name (max 2 spaces allowed): ");
                name = sc.nextLine();
            } while (countSpaces(name) > 2);

            int age;
            do {
                System.out.print("Enter age (18-60): ");
                age = Integer.parseInt(sc.nextLine().trim());
            } while (age < 18 || age > 60);

            String designation;
            double salary;
            String letter;
            do {
                System.out.print("Enter designation (p=Programmer, t=Tester, m=Manager): ");
                letter = sc.nextLine().trim().toLowerCase();
            } while (!letter.equals("p") && !letter.equals("t") && !letter.equals("m"));

            if (letter.equals("m")) {
                designation = "Manager";
                salary = 50000;
            } else if (letter.equals("p")) {
                designation = "Programmer";
                salary = 35000;
            } else {
                designation = "Tester";
                salary = 25000;
            }

            employees.add(new Employee(name, age, designation, salary));
            System.out.println(name + " added successfully with salary " + salary);

            System.out.print("Add another employee? (yes/no): ");
            again = sc.nextLine();
        } while (again.equalsIgnoreCase("yes"));
    }

    static int countSpaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') count++;
        }
        return count;
    }

    // Display employees
    static void display() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.printf("%d. Name: %s | Age: %d | Designation: %s | Salary: %.2f%n",
                    i + 1, e.name, e.age, e.designation, e.salary);
        }
    }

    // Raise salary
    static void raiseSalary() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        System.out.print("Enter employee name to raise salary: ");
        String name = sc.nextLine();

        Employee found = employees.stream()
                .filter(e -> e.name.equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);

        if (found == null) {
            System.out.println("Employee not found.");
            return;
        }

        double percent;
        do {
            System.out.print("Enter raise percentage (1-10): ");
            percent = Double.parseDouble(sc.nextLine().trim());
        } while (percent < 1 || percent > 10);

        found.salary += found.salary * percent / 100;
        System.out.println("Updated salary of " + found.name + " is " + found.salary);
    }

    // Exit program
    static void exit() {
        System.out.print("Confirm exit? (yes/no): ");
        String confirm = sc.nextLine().trim();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Program terminated. Goodbye!");
            exitProgram = true;
        }
    }
}

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

            int choice = -1; // default invalid
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice!!!");
                continue; // restart loop
            }

            switch (choice) {
                case 1 -> create();
                case 2 -> display();
                case 3 -> raiseSalary();
                case 4 -> exit();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void create() {
        String again;
        do {
            String name;
            do {
                System.out.print("Enter name (max 2 spaces allowed, only alphabets): ");
                name = sc.nextLine();

                // Validation: only alphabets and spaces allowed
                if (!name.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid name. Please enter valid alphabets only.");
                    name = ""; // force retry
                }
            } while (countSpaces(name) > 2 || name.isEmpty());

            int age;
            do {
                System.out.print("Enter age (18-60): ");
                try {
                    age = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age. Please enter a number.");
                    age = -1; // force retry
                }
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

        double percent = -1;
        do {
            System.out.print("Enter raise percentage (1-10): ");
            try {
                percent = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                percent = -1;
            }
        } while (percent < 1 || percent > 10);

        found.salary += found.salary * percent / 100;
        System.out.println("Updated salary of " + found.name + " is " + found.salary);
    }

    static void exit() {
        System.out.print("Confirm exit? (yes/no): ");
        String confirm = sc.nextLine().trim();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Program terminated. Goodbye!");
            exitProgram = true;
        }
    }
}

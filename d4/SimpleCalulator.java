package d4;

	import java.util.Scanner;

	public class SimpleCalulator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Choose an operation:");
	        System.out.println("1. Add");
	        System.out.println("2. Subtract");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        int choice = sc.nextInt();

	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Division by zero!");
	                }
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }

	        sc.close();
	    }
	}


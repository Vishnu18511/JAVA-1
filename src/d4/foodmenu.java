package d4;

import java.util.Scanner;

	public class foodmenu {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (1 to 5): ");
	        int day = sc.nextInt();

	        switch (day) {
	            case 1:
	                System.out.println("PIZZA");
	                break;
	            case 2:
	                System.out.println("BURGIR");
	                break;
	            case 3:
	                System.out.println("SANDWITCH");
	                break;
	            case 4:
	                System.out.println("PASTA");
	                break;
	            case 5:
	                System.out.println("tirra Mussu");
	                break;
	            default:
	                System.out.println("Invalid input! Please enter 1–5.");
	        }

	        sc.close();
	    }
	}


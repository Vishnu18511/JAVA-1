package d13;

public class p5 {
	  public static void main(String[] args) {

	        int[] salary = {25000, 40000, 30000, 50000};

	        int max = salary[0];

	        for (int i = 1; i < salary.length; i++) {
	            if (salary[i] > max) {
	                max = salary[i];
	            }
	        }

	        System.out.println("Highest salary: " + max);
	    }
	}
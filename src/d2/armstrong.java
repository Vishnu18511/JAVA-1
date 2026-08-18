package d2;

public class armstrong {
	    public static void main(String[] args) {
	        int num = 153;  // input the number
	        int originalNum = num;
	        int result = 0;
	        int n = 0;

	        // Count digits
	        int temp = num;
	        while (temp != 0) {
	            temp /= 10;
	            n++;
	        }

	        // Calculate sum of powers of digits
	        temp = num;
	        while (temp != 0) {
	            int digit = temp % 10;
	            result += Math.pow(digit, n);
	            temp /= 10;
	        }

	        // Check Armstrong condition
	        if (result == originalNum)
	            System.out.println(originalNum + " is an Armstrong number.");
	        else
	            System.out.println(originalNum + " is not an Armstrong number.");
	    }
	}


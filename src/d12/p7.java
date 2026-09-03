package d12;

public class p7 {
		public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 3, 12};
	        int[] temp = new int[arr.length];
	        int j = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                temp[j] = arr[i];
	                j++;
	            }
	        }
	        for (int i = 0; i < temp.length; i++) {
	            System.out.print(temp[i] + " ");
	        }
	    }
	}
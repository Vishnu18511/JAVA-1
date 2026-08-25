package d6;

public class p17 {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40};
		int[] arr2= {50,20,10,60};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}

	}
}

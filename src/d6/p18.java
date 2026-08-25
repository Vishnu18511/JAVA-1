package d6;

public class p18 {
	public static void main(String[] args) {
		String[] arr1= {"hi","java"};
		String[] arr2= {"java","world"};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}




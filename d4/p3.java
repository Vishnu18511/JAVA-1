package d4;

public class p3 {
//	public static void main(String[]args) {
//		int n = 100000;
//		int[] students = new int[n];
//		
//		for (int i =0;i<n;i++) {
//			students[i] = i + 1;
//			}
//	int target = 1000;
//	boolean found = false;
//	for (int i = 0; i < n;i++) {
////		for (int j = 0; j < n;i++) {
//			if(students[i] == target) {
//				found = true;
//				break;
//			}
//		}
//		
//	
//  System.out.println("student found:"+found);
//}
//}
//}
public static void main(String[] args) {
	int n=100000;
	int[] students=new int[n];

	int target=1000;
	boolean found=false;
	for(int i=0;i<n;i++) {
		students[i]=i+1;
		if(students[i]==target) {
			found=true;
		}
		if(found) {
			break;
		}
	}
	System.out.println("Student Found:"+found);
}
}




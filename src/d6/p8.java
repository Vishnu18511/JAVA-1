package d6;

public class p8 {
	public static void main(String[] args) {
		int[] marks = {50,30,20,46,100,60,20};
		int currentmarks = 0;
		int bestmarks = 0;
		for(int i =0;i<marks.length;i++) {
			currentmarks = marks[i];
			if(currentmarks>bestmarks) {
				bestmarks = currentmarks;
			}
		}
		System.out.println("best marks:"+bestmarks);
	}

}


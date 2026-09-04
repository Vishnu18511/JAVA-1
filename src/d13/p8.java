package d13;

public class p8 {
	public static void main(String[] args) {

        int[] attendance = {101, 102, 101, 103, 101};
        int search = 101;
        int count = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == search) {
                count++;
            }
        }

        System.out.println("Employee ID " + search + " appears " + count + " times");
    }
}
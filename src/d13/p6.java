package d13;

public class p6 {
	public static void main(String[] args) {

        int[] employeeId = {10, 15, 20, 25, 30};
        int count = 0;

        for (int i = 0; i < employeeId.length; i++) {
            if (employeeId[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even IDs: " + count);
    }
}
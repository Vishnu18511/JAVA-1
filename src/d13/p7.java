package d13;

public class p7 {
	public static void main(String[] args) {

        int[] productId = {101, 102, 103, 104};
        int search = 103;
        boolean found = false;

        for (int i = 0; i < productId.length; i++) {
            if (productId[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product ID found");
        } else {
            System.out.println("Product ID not found");
        }
    }
}
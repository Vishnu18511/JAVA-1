package d7;
import java.util.*;
public class p6 {
	public static void main(String[] args) {

        ArrayList<Integer> salary = new ArrayList<>();

        salary.add(10000);
        salary.add(8000);
        salary.add(6000);
        salary.add(4000);
        salary.add(2000);
        salary.add(0);

        Iterator<Integer> it = salary.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


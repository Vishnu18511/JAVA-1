package d9;

import java.util.*;

public class p10 {

    public static void main(String[] args) {

        int[] numbers = {
            1274894847, 19489737, 3890982, 074747, 528408, 8209380
        };

        String search = "12";

        ArrayList<Integer> result = new ArrayList<>();

        for (int number : numbers) {

            if (String.valueOf(number).contains(search)) {
                result.add(number);
            }
        }

        System.out.println("Search result:");

        for (int number : result) {
            System.out.println(number);
        }
    }
}
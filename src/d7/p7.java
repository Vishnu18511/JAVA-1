package d7;

public class p7 {
	static void withdraw(int salary) {

        System.out.println(salary);

        if (salary == 0) {
            return;
        }

        withdraw(salary - 2000);
    }

    public static void main(String[] args) {

        withdraw(10000);

    }
}


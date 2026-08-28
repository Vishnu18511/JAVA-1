package d8;
import java.util.Scanner;
class p9 {
	int age = 20;

    static String college = "ABC College";

    p9() {
        System.out.println("Constructor called");
    }

    void display(String name) {
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the name:");
    	String name = sc.nextLine();
        p9 s = new p9();

        s.display(name);
    }
}
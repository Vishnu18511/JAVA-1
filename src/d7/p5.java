package d7;

public class p5 {
	static String correctPassword="123";
	static void tryPassword(String password) {
		System.out.println("Trying: "+password);
		if(password.equals(correctPassword)) {
			System.out.println("Password found: "+password);
			return;
		}
		System.out.println("Wrong password. Go back andd try another. ");
	}
	public static void main(String[] args) {
		tryPassword("123");
		tryPassword("132");
		tryPassword("213");
		tryPassword("231");
	}

}
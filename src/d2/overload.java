package d2;

public class overload {
	// poly morphism
	//method overloading
	// method overriding

		void m1() {
			System.out.println("sdfa");
		}
		void m1(int a) {
			System.out.println("dfasdfasdfasfas");
		}
		public static void main(String[] args) {
			overload test = new overload();// object
			test.m1();
			test.m1(3);
		}
}

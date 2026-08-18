package d2;

//public class p6 {
	class Par {
		private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class p6 extends Par {

	public static void main(String[] args) {
		p6 test = new p6();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}
//}

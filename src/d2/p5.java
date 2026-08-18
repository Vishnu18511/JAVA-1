package d2;

public class p5 {
	int a;
	int b;

	void m1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void m2() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		p5 vv = new p5();
		vv.m1(4, 3);
		vv.m2();
	}
}


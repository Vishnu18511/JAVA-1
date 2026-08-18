package d2;

public class p3 {
	int a = 20;
	int b = 10;

	void m1(int a,int b ) {
		System.out.println("asdfas"+(this.a+this.b));

		System.out.println("dfasdf "+(a+b));
//		System.out.println("dfasdf "+(c+d));
	}

	public static void main(String[] args) {
		p3   vv = new p3();
		vv.m1(4,3);
	}
}


package d2;

//public class multihin {
	interface Atmm {
		abstract void depo();
	}
	interface Atm1 {
		abstract void min();
	}
	public class multihin implements Atmm, Atm1 {
		public void depo() {
			System.out.println("dep");
		}
		public void min() {
			System.out.println("min");
		}
		public static void main(String[] args) {
			multihin v = new multihin();
			v.min();
			v.depo();
		}
	}


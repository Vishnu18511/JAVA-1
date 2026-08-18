package d2;

//public class p7 {
	class Parent
	{
		void cancer()
		{
			System.out.println(" understain");
		}
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}

	public class p7 extends Parent{

		public static void main(String[] args) {
	 		p7  bb= new p7();
	 		bb.bp();
	 		bb.cancer();
		}
	}

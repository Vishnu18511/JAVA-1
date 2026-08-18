package d2;

//public class p9 {
	// Hierarchical in
	class GrandParen
	{
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}
	class Paren extends GrandParen
	{
		void cancer()
		{
			System.out.println(" understain");
		}
		
	}

	public class p9 extends GrandParen{

		public static void main(String[] args) {
	 		p9  bb= new p9();
	 		Paren x=new Paren();
	 		bb.bp();
	 		x.cancer();
		}
	}
//}

	
	
	
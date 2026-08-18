package d2;

//public class p8 {
	class GrandParent
	{
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}
	class Pare extends GrandParent
	{
		void cancer()
		{
			System.out.println(" understain");
		}
		
	}

	public class p8 extends Pare{

		public static void main(String[] args) {
	 		p8 bb= new p8();
	 		bb.bp();
	 		bb.cancer();
		}
	}


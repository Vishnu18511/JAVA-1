package d2;

//public class dildride {
	class Parents
	{
	   void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }
	}
	public class dildride extends Parents {
		void marry()
		{
			System.out.println("campus selected girl/boy");
		}
		public static void main(String[] args) {
			dildride test = new dildride();// object
			test.marry();
			test.property();
		
		}
	}
//}

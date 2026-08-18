package d2;

//public class interfas {
	interface Atm
	{
		abstract void depo();	
		abstract void with();
	}
	abstract class Abc implements Atm
	{
		public	void depo()
		{
			System.out.println("Depos");
		}
		}

	public class interfas extends Abc{

		public	void with()
		{
			System.out.println("With");
		}

		
	public static void main(String[] args) {
		interfas   v = new interfas();
		v.depo();
		v.with();
	}
	}
//}

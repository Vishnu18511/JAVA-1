package d2;

//Hierarchical in
class GrandPare
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Pa extends GrandPare
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class p10 extends GrandPare{

	public static void main(String[] args) {
		p10  bb= new p10();
		Pa y=new Pa();
		bb.bp();
		y.cancer();
	}
}

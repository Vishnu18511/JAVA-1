package d3;

	public class p7 implements Runnable {
		  public void run() {
			for (int i=0;i<5;i++)
			{
				System.out.println("method"+i);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		   
		    p7 a= new p7();
		    
		    Thread b=new Thread(a);
			b.start();
			for(int i=0;i<5;i++) {
				System.out.println("main method"+i);
			}

		}

	}

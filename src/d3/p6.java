package d3;


public class p6 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("method"+i);
		}
	}

	public static void main(String[] args) {
		p6 test=new p6();
		test.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("main method"+i);
		}
	}

}

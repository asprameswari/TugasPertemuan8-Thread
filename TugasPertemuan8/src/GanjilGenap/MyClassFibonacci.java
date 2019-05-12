package GanjilGenap;

public class MyClassFibonacci extends Thread {

	public MyClassFibonacci() {
		// TODO Auto-generated constructor stub
	}

	public void run(){
		try {
			for (int i = 1; i <= 50; i++) {
				 
				if ( i < 2 ) {
		            System.out.println(i + " adalah bilangan Fibonacci");
		            Thread.sleep(30000);	            
		        }
		        else {
		             System.out.println(i + " bukan bilangan Fibonacci");
		             Thread.sleep(30000);
		        }

			}
		}catch(InterruptedException ie) {
			System.out.println("Problem with thread");
		}
		
	}
	
}

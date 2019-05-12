package PrimeNumber;

public class MyClassFibonacci implements Runnable {

	int a,b,c,n;
	
	public MyClassFibonacci() {
		a = c = n = 0;
		b = 1;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(n++ < 20)
			{
				System.out.println(n+"th" +" Fib no: = "+a);
				c = a + b;
				a = b;
				b = c;
				Thread.sleep(60000);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}

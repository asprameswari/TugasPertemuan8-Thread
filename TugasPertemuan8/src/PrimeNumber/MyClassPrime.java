package PrimeNumber;

public class MyClassPrime implements Runnable {

	int j,c;
	
	public MyClassPrime() {
		// TODO Auto-generated constructor stub
		super();
		c = 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i <= 30; i++)
			{
				for(j = 2; j<= i; j++)
				{
					if(i%j == 0)
						break;
				}
				if(j == i)
				{ 
					c++;	
					System.out.println(c+"th" +" Prime no: = "+i);
					Thread.sleep(60000);
				}	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}

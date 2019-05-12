package PrimeNumber;

public class Demo {

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		System.out.println("Nama Thread : "+ct.getName());
		
		MyClassPrime PRIMA = new MyClassPrime();
		Thread prime = new Thread(PRIMA ,"Bilangan Prima");
		prime.start();
		System.out.println("10 pertama" + prime.getName() + " started.");	
		
		MyClassFibonacci FIBONACCI = new MyClassFibonacci();
		Thread fibo = new Thread(FIBONACCI,"Bilangan Fibonacci");
		fibo.start();
		System.out.println("20 Pertama " + fibo.getName() + " started.");
			
			
	}

}


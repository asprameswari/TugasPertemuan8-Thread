package GanjilGenap;

public class Demo {

	public static void main(String[] args) {
		MyClassGanjilGenap GG = new MyClassGanjilGenap();
		Thread th1 = new Thread(GG ,"GanjilGenap");
		th1.start();
		System.out.println("Bilangan"+ th1.getName() + " started.");
		
		MyClassFibonacci FB = new MyClassFibonacci();
		Thread th2 = new Thread(FB ,"Fibonacci");
		th2.start();
		System.out.println("Bilangan"+ th2.getName() + " started.");
		
			
			
	}

}

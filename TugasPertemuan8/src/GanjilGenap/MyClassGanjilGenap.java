package GanjilGenap;

public class MyClassGanjilGenap extends Thread {
	public void run() {
		try{
			for (int i = 1; i <= 10; i++) {
 
				if(i%2==0){
					System.out.println("Angka Genap:" +i);
					Thread.sleep(30000);
				}else {
					System.out.println("Angka Ganjil : " +i);
					Thread.sleep(30000);
				}
			}
		}catch(InterruptedException ie){
			System.out.println("Problem with thread");
		}
	}
	

}


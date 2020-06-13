package multhithreading;

public class Multiply {
	
	public synchronized void multiplication(int n) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Current thread is : " + Thread.currentThread().getName());
			System.out.println("Multiplication : " + n * i);
		}
	}
	
}

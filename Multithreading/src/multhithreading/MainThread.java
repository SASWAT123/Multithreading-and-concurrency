package multhithreading;

public class MainThread {

	public static void main(String[] args) {
		
		System.out.println("Inside the main thread : " + Thread.currentThread().getName());
		
		Multiply mul = new Multiply();
		Thread thread1 = new Thread1(mul);
		Thread thread2 = new Thread2(mul);

		thread1.start();
		thread2.start();
	}

}

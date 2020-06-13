
public class AnotherThread extends Thread{

	@Override
	public void run() {
		
		System.out.println("Running from the other thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("After sleep " + Thread.currentThread().getName());
	
	}
	
	
	
}

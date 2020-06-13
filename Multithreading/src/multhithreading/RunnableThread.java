package multhithreading;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Current Thread state inside runnable: " + Thread.currentThread().getState());
		System.out.println("Current Thread name inside runnabele: " + Thread.currentThread().getName());
		
	}

}

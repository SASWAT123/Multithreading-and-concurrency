
public class RunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("From the Runnable thread " + Thread.currentThread().getName());
	}

}

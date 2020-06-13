package ThreadCommunication;

public class Producer implements Runnable{
	
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
		}
		
	}

}

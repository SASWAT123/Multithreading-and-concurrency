package Producer_Consumer_BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	BlockingQueue<Integer> queue;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				System.out.println("Data Produced : " + i);
				queue.put(i);
			} catch (InterruptedException e) {
				System.out.println("Producer interrupted");
			}
		}
		
	}
	

}

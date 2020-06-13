package Producer_Consumer_BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Data consumed : " + queue.take() + "   by : " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("Consumer Interrupted");
			}
		}
	}

}

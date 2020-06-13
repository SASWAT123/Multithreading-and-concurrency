package Producer_Consumer_BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainThread {
	
	public static void main(String[] args) {
		//printing the name of the main thread
		System.out.println("Main thread : " + Thread.currentThread().getName());
		
		//Blocking queue is thread safe and hence synchronization works
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		
		//Call the producer
		Thread producer = new Thread(new Producer(queue));
		
		//Call the consumer
		Thread consumer1 = new Thread(new Consumer(queue));
		Thread consumer2 = new Thread(new Consumer(queue));
		
		producer.start();
		consumer1.start();
		consumer2.start();
		
	}

}

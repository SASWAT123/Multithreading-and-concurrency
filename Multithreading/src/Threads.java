public class Threads {

	public static void main(String[] args) {
		
//		//Printing the output from the main thread
//		System.out.println("Running from the main : " + Thread.currentThread().getName()); 
//		
//		//Creating a new thread
//		Thread anotherThread = new AnotherThread();
//		
//		/*The start() method will cause the JVM to spawn a new thread and make the newly spawned thread execute run() . 
//		 * When you invoke start() method a new thread is created and run() method is executed in this new thread
//		 */
//		
//		anotherThread.start();
//		
//		/* If you directly call run() method its body is executed in context of current thread. */
//		anotherThread.run();
//		
//		//Using anonymous class for creating and invoking thread
//		new Thread() {
//			public void run() {
//				System.out.println("Running from the anonymous thread " + Thread.currentThread().getName());
//			}
//		}.start();
//		
//		//Threads using Runnable
//		//Using anonymous class
//		new Thread(new RunnableThread() {
//
//			@Override
//			public void run() {
//				System.out.println("From the main runnable " + Thread.currentThread().getName());
//			}
//			
//		}).start();
//		
//		//By creating the instance of RunnableThread
//		Thread newRunnable = new Thread(new RunnableThread());
//		
//		newRunnable.start();
		
//		Thread thread = new AnotherThread();
//		thread.start();
//		//thread.interrupt();
		
//		Thread thread = new Thread1();
//		Thread thread1 = new Thread1();
//		Thread thread2 = new Thread1();
//		
//		thread.start();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.toString();
//		}
//		
//		thread1.start();
//		
//		thread2.start();

	}

}

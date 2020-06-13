package multhithreading;

public class ThreadBasic {

	public static void main(String[] args) {
		
//		Thread t = Thread.currentThread();
//		System.out.println("Current Thread is : " + t.getName());
//		System.out.println("Current Thread is : " + t.getPriority());
//		System.out.println("Current Thread is : " + t.getState());
		
		RunnableThread r1 = new RunnableThread();
		Thread t1 = new Thread(r1);
		System.out.println("Current thread state : " + t1.getState());
		System.out.println("Current thread name : " + t1.getName());
		t1.start();
	}
	
	

}

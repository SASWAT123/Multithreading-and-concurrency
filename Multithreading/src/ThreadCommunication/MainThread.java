package ThreadCommunication;

public class MainThread {

	public static void main(String[] args) {
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press Control-C to stop."); 

	}

}


public class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.toString();
			}
		}
	}
	
	

}

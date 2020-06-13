package multhithreading;

public class Thread1 extends Thread{
	
	Multiply mul1;
	
	public Thread1(Multiply mul) {
		this.mul1 = mul;
	}

	@Override
	public void run() {
		mul1.multiplication(7);
	}
	
	
	
}

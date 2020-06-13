package multhithreading;

public class Thread2 extends Thread{
	
	Multiply mul2;

	Thread2(Multiply mul){
		this.mul2 = mul;
	}

	@Override
	public void run() {
		mul2.multiplication(5);
	}
	
	
	
}

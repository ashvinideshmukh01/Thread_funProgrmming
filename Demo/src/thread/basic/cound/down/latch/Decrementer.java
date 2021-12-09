package thread.basic.cound.down.latch;

import java.util.concurrent.CountDownLatch;

public class Decrementer implements Runnable{
	
	CountDownLatch latch;	

	public Decrementer(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {

		try {
			
			System.out.println("0Decremeter is started.........");
			Thread.sleep(2000);
			latch.countDown();
			
			Thread.sleep(2000);
			latch.countDown();
			
			Thread.sleep(2000);
			latch.countDown();
			
			System.out.println("I have decremented latch to Zero...");
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

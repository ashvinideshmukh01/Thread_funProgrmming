package thread.basic.cound.down.latch;

import java.util.concurrent.CountDownLatch;

public class WaiterForLatch implements Runnable{
	
	CountDownLatch latch;	

	public WaiterForLatch(CountDownLatch latch) {
		super();
		this.latch = latch;
	}
	
	@Override
	public void run() {

		try {
			
			System.out.println("Waiter is wating........");
			latch.await();
			System.out.println("Latch is Zero...I can resume my work!!!");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

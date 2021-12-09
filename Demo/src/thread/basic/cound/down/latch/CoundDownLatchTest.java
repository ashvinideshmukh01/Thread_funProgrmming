package thread.basic.cound.down.latch;

import java.util.concurrent.CountDownLatch;

public class CoundDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		WaiterForLatch w = new WaiterForLatch(latch);
		
		Decrementer d = new Decrementer(latch);
		
		Thread waiterThread = new Thread(w);
		
		Thread decreameterThread = new Thread(d);
		
		waiterThread.start();
		decreameterThread.start();
		
		waiterThread.join();
		decreameterThread.join();
		
	}

}

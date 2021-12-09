package thread.basic.cound.down.latch;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {

	public static void main(String[] args) {
		
		BlockingQueue<Callable<String>> workQueue = new ArrayBlockingQueue<>(10);

		ExecutorService threadPoolExecutor = new ThreadPoolExecutor(2, 5, 10000, TimeUnit.SECONDS);
		
		workQueue.add(()-> {
			System.out.println("Added 1");
			return ""; 
		});
		
		workQueue.put(()-> {
			System.out.println("Added 2");
			
		});
		
		workQueue.add(()-> {
			System.out.println("Added 3");
			return;
		});
		
	  threadPoolExecutor.invokeAll(workQueue);
	
	}

}

package thread.basic.executor.service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService threadService = Executors.newFixedThreadPool(1);
		
		
		Future<?> future = threadService.submit(() -> {			
			System.out.println("I am running executror sevice for 5 second.........");
			try {
				Thread.sleep(5000);
				return "FUTURE 1";
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "FUTURE 1";
		});		

		//future.get();
		
		Future<?> future2 = threadService.submit(() -> {			
			System.out.println("I am running executror sevice for 5 second.........");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});	
		
		Future<?> future3 = threadService.submit(() -> {			
			System.out.println("I am running executror sevice for 15 second.........");
			try {
				Thread.sleep(15000);//1000 line
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});	
		
		Future<?> future4 = threadService.submit(() -> {			
			System.out.println("I am running executror sevice for 40 second.........");
			try {
				Thread.sleep(40000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});	
		
		//Thread.sleep(20000);
		
		future.cancel(true); //50 Sec block here
		//System.out.println(r);
		future2.get();	
		System.out.println("Future 2 completed...");
		future3.get();
		System.out.println("Future 3 completed...");
		future4.get();
		System.out.println("Future 4 Completed...");		
		System.out.println("Task completed...");		
		
		threadService.shutdown();
		
	}

}

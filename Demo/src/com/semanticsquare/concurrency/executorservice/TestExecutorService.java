package com.semanticsquare.concurrency.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		//newSingleThreadExecutor.execute(()->System.out.println("Asynchronous task!!!"));
		//newSingleThreadExecutor.shutdown();
		
		
		Future<?> submit = newSingleThreadExecutor.submit(()->System.out.println("submit with runnable!!"));
	    Object object = submit.get();
	    System.out.println(object);
		if(object==null) {
		System.out.println("task completed");
		}
		newSingleThreadExecutor.shutdown();
		
//		Future<Integer> submit = newSingleThreadExecutor.submit(()->{return 0;});
//		Integer integer = submit.get();
//		System.out.println(integer);
		
	}

}

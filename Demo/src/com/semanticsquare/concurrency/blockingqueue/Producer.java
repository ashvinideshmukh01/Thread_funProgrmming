package com.semanticsquare.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Producer implements Runnable{
	
	//ArrayBlockingQueue<String> queue = null;
	PriorityBlockingQueue<String> queue =null;

	public Producer(PriorityBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			queue.put("Rajveer");
			//Thread.sleep(1000);
			queue.put("veer");
			//Thread.sleep(1000);
			queue.put("Raj");
			//queue.put("veer");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}

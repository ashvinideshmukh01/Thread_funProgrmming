package com.semanticsquare.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Consumer implements Runnable {
	//ArrayBlockingQueue<String> queue = null;
	PriorityBlockingQueue<String> queue =null;

	public Consumer(PriorityBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

package com.semanticsquare.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TestArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		//ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
		PriorityBlockingQueue<String> queue=new PriorityBlockingQueue<>(1024);
		Producer Producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		Thread p = new Thread(Producer);
		Thread c = new Thread(consumer);
		
		p.start();
		c.start();
		Thread.sleep(4000);
	}

}

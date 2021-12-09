package com.semanticsquare.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Test {

	public static void main(String[] args) {
		CountDownLatch latch=new CountDownLatch(3);
		Waiter waiter = new Waiter(latch);
		Decreatmenter decrement= new Decreatmenter(latch);
		
		
		Thread w = new Thread(waiter);
		Thread d = new Thread(decrement);
		
		w.start();
		d.start();
	}

}

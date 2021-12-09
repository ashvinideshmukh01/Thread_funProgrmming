package com.semanticsquare.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Decreatmenter implements Runnable{

	CountDownLatch latch =null;
	
	public Decreatmenter(CountDownLatch latch) {
		super();
		this.latch = latch;
	}


	@Override
	public void run() {
		latch.countDown();
		try {
			Thread.sleep(1000);
			latch.countDown();
			Thread.sleep(1000);
			latch.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

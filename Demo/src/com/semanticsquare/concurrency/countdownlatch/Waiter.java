package com.semanticsquare.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable{

	CountDownLatch latch =null;
	
	public Waiter(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			latch.await();
			System.out.println("waiter released");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

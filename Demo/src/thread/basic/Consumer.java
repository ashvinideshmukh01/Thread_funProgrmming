package thread.basic;

import java.util.LinkedList;

public class Consumer {
	
	public LinkedList<Integer> producerQueue;
	public int capacity;
	public Object lock;

	public Consumer(LinkedList<Integer> producerQueue, int capacity, Object lock) {
		this.producerQueue = producerQueue;
		this.capacity = capacity;
		this.lock = lock;
	}
	
	public void cosumer() throws InterruptedException {
		while(true) {
			synchronized (lock) {
				if(producerQueue.isEmpty())
					lock.wait();
				Integer removeFirst = producerQueue.removeFirst();	
				System.out.println("Consumed : "+ removeFirst);
				lock.notify();
				Thread.sleep(1000);
			}
		}
	}
}
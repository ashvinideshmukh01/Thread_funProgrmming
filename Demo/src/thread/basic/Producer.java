package thread.basic;

import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable{
	
	public LinkedList<Integer> producerQueue;
	public int capacity;
	public Object lock;

	public Producer(LinkedList<Integer> producerQueue, int capacity, Object lock) {
		this.producerQueue = producerQueue;
		this.capacity = capacity;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				synchronized (lock) {
					if(producerQueue.size() == capacity)
						lock.wait();				
					int nextInt = new Random().nextInt();
					System.out.println("Produced : "+ nextInt);
					producerQueue.add(nextInt);
					lock.notify();
					Thread.sleep(1000);
				}	
			} catch (Exception e) {
			}
					
		}
	}
	
	

}

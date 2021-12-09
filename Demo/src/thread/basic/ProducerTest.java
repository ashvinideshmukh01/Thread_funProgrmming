package thread.basic;

import java.util.LinkedList;

public class ProducerTest {

	public static void main(String[] args) throws InterruptedException {
		
		LinkedList<Integer> producerQueue = new LinkedList<>();
		LinkedList<Integer> consumer = new LinkedList<>();
		int capacity = 2;
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		
		Consumer c = new Consumer(producerQueue, capacity, lock1);
		
		Thread producer = new Thread(new Producer(producerQueue, capacity, lock1));
		
		Thread cosnumer = new Thread(() -> {
			try {
				c.cosumer();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		});
		
		producer.setName("PRODUCER");
		cosnumer.setName("CONSUMER");
		producer.start();
		cosnumer.start();
		
		producer.join();
		cosnumer.join();

	}

}

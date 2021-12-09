package thread.basic.test;

public class ThreadDemo {	
	
	public static void main(String[] args) throws InterruptedException {
		
		RandomStringThead t = new RandomStringThead();
		
		Runnable randomInt = () -> {
			while(true) {
				System.out.println(RandomUtil.randomInt());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		};
		
		Thread randomIntThread = new Thread(randomInt, "INT");		
		
		t.start();
		randomIntThread.start();
		
		randomIntThread.join();
		t.join();
		
	}

}

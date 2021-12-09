package thread.basic.test;

public class RandomStringThead extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println(RandomUtil.randomString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}	
	
}

package thread.basic.automic.nonblocking;

public class LockBasedCounter {
	
	private long threadSafeLong; 
	
	public synchronized long getThreadSafeLong() {
		return threadSafeLong;
	}
	
	public synchronized void increment() {
		threadSafeLong++;//read-modify-write
	}
}

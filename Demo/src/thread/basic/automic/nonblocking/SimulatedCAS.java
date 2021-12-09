package thread.basic.automic.nonblocking;

public class SimulatedCAS {
	
	// Let's assume for simplicity our value is a long
    private long currentValue = 0;

	public SimulatedCAS(long value) {
		this.currentValue = value;
	}
    
	public synchronized long getValue() {
        return currentValue;
    }
	
	// The synchronized keyword causes all the steps in this method to execute
    // atomically, which is akin to simulating the compare and swap processor
    // instruction. The behavior of the function is as follows:
    //
    // 1. Return the expectedValue if the CAS instruction completes successfully, i.e.
    //    the newValue is written.
    // 2. Return the current value if the CAS instruction doesn't complete successfully
    //
    // The method is setup such that when expectedValue equals the return value
    // the caller can assume success.
    synchronized long compareAndSwap(long expectedValue, long newValue) {

        if (currentValue == expectedValue) {
            currentValue = newValue;
            return expectedValue;
        }

        // return whatever is the current value
        return currentValue;
    }

}

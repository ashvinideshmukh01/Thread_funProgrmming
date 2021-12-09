package thread.basic.automic.nonblocking;

public class Demonstration {

public static void main( String args[] ) {
        
        NonblockingCounter counter = new NonblockingCounter();

        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.get());        
    }
	
}

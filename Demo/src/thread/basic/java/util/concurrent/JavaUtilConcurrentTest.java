package thread.basic.java.util.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Predicate;

public class JavaUtilConcurrentTest {

	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		bq.add("rajveer");
		bq.removeIf(new NamePredicate());    //1
		bq.removeIf(new Predicate<String>() {//2
			@Override
			public boolean test(String name) {
				return name.equals("");
			}
		});
		bq.removeIf(name -> name.equals(""));//3
		
		
	}

}

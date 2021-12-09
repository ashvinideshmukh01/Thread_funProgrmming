package thread.basic.java.util.concurrent;

import java.util.function.Predicate;

public class NamePredicate implements Predicate<String>{

	@Override
	public boolean test(String name) {
		return name.equals("");
	}

}

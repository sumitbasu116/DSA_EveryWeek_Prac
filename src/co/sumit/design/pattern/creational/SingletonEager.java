package co.sumit.design.pattern.creational;

public class SingletonEager {

	private static final SingletonEager INSTANCE = new SingletonEager(); // Eagerly initialized

	private SingletonEager() {
	}

	public static SingletonEager getObject() {
		return INSTANCE;
	}
}
/*
 * Suppose, interviewer asked that without writing Thread safety code, how we
 * can achieve singleton?
 * Then an eager initialization method is also valid.
 * The instance is created at class loading time, making it thread-safe. But it
 * always initializes the instance, even if it's never used.
 */

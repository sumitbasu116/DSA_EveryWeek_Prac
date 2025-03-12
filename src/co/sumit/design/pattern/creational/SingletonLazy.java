package co.sumit.design.pattern.creational;

public class SingletonLazy {
	// Volatile ensures visibility of changes across threads
	public static volatile SingletonLazy object;
	private SingletonLazy() {
        // Private constructor to prevent instantiation
    }
	public static SingletonLazy getInstance() {
		if(object==null) {
			synchronized (SingletonLazy.class) {
				if(object==null) {
					object = new SingletonLazy();
				}
			}
		}
		return object;
	}
}

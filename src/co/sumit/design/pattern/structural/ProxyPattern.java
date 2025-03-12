package co.sumit.design.pattern.structural;

/* Proxy Pattern (Acts as a placeholder for another object)
 * Useful for lazy initialization, access control, logging, or caching.
 * Use Case: When controlling access to expensive operations (e.g., database access, network calls).
 */
public class ProxyPattern {

	interface Service {
		void request();
	}

	class RealService implements Service {
		public void request() {
			System.out.println("Processing request in Real Service");
		}
	}

	class ProxyService implements Service {
	    private RealService realService;

	    public void request() {
	        if (realService == null) realService = new RealService();
	        System.out.println("Logging: Request made");
	        realService.request();
	    }
	}
	
	public static void main(String[] args) {
		// Usage
		Service service = new ProxyService();
		service.request();
	}
}

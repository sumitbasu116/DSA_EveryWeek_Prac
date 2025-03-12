package co.sumit.design.pattern.behavioral;

import java.util.ArrayList;
import java.util.List;

/* Behavioral Design Patterns (How objects communicate)
 * These patterns define how objects interact with each other.
 * Observer Pattern (Publish-Subscribe Model)
 * Used when multiple objects need to react to state changes in another object.
 * Use Case: Event-driven applications, Kafka consumers, or notification systems.
 */
public class ObserverPattern {

	//Step 1: Create an Observer Interface
	interface Observer{
		void update(String message); // Method called when notified
	}
	
	//Step 2: Create a Concrete Observer (Subscriber)
	class Subscriber implements Observer{
		
		private String name;
		
		 public Subscriber(String name) {
		        this.name = name;
		    }
		
		@Override
		public void update(String message) {
			 System.out.println(name + " received notification: " + message);
		}
	}
	
	//Step 3: Create a Subject (YouTube Channel)
	class YouTubeChannel {
		private List<Observer> observers = new ArrayList<>();
		
		public void subscribe(Observer observer) {
			this.observers.add(observer);
		}
		
		public void unsubscribe(Observer observer) {
			this.observers.remove(observer);
		}
		
		public void uploadVideo(String videoTitle) {
			 System.out.println("New Video Uploaded: " + videoTitle);
			 notifySubscribers(videoTitle);
		}
		
		public void notifySubscribers(String message) {
			for(Observer observer:this.observers) {
				observer.update("New Video: " + message);
			}
		}
	}
	
	public static void main(String[] args) {
		
		 // Create a YouTube Channel
        YouTubeChannel channel = new YouTubeChannel();

        // Create subscribers
        Observer user1 = new Subscriber("Alice");
        Observer user2 = new Subscriber("Bob");
        Observer user3 = new Subscriber("Charlie");

        // Subscribe to the channel
        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        // Upload a new video
        channel.uploadVideo("Observer Pattern Explained!");

        // Unsubscribe one user and upload another video
        channel.unsubscribe(user2);
        channel.uploadVideo("Java Design Patterns in Depth!");

	}

}

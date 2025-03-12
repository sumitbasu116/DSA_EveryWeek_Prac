package co.sumit.design.pattern.behavioral;

public class StrategyPattern {

	interface PaymentStrategy {
		void pay(int amount);
	}

	class CreditCardPaymentStrategy implements PaymentStrategy {
		@Override
		public void pay(int amount) {
			System.out.println("Paid " + amount + " using Credit Card");
		}
	}

	class PaypalPaymentStrategy implements PaymentStrategy {
		@Override
		public void pay(int amount) {
			System.out.println("Paid " + amount + " using Paypal");
		}
	}

	class PaymentContext {
		private PaymentStrategy paymentStrategy;

		public PaymentContext(PaymentStrategy strategy) {
			this.paymentStrategy = strategy;
		}

		public void executePayment(int amount) {
			paymentStrategy.pay(amount);
		}
	}

	public static void main(String[] args) {
		// Usage
		PaymentContext context = new PaymentContext(new PayPalPayment());
		context.executePayment(100);
	}

}

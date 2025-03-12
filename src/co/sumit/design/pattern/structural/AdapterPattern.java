package co.sumit.design.pattern.structural;

/* Adapter Pattern (Bridges two incompatible interfaces)
 * Helps two incompatible classes work together.
 */

public class AdapterPattern {

	// Old Interface
	interface OldCharger {
	    void chargeOld();
	}

	// New Interface
	interface NewCharger {
	    void chargeNew();
	}
	
	// Old Implementation
	class OldPhoneCharger implements OldCharger {
	    public void chargeOld() { System.out.println("Charging using old charger"); }
	}
	
	//Adapter should implement the new interface and should contain old interface object.
	class ChargerAdapter implements NewCharger{

		private OldCharger oldCharger;
		
		public ChargerAdapter(OldCharger oldCharger) {
			this.oldCharger = oldCharger;
		}
		
		@Override
		public void chargeNew() {
			oldCharger.chargeOld();
		}
		
	}
	
	public static void main(String[] args) {
		
		// Usage
		NewCharger newCharger = new ChargerAdapter(new OldPhoneCharger());
		newCharger.chargeNew(); // Output: Charging using old charger
	}
}

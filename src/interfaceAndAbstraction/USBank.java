package interfaceAndAbstraction;

public interface USBank {
	
	int minbal=1000;     // variables in the interface should be initialize with some value 
	public void credit();
	public void debit();
	public void transfer();

	// no method body only method declaration
	//method prototype
	//We can not create object of interface
	// no static methods are allowed in interface
	//  But variables in interface are by default static in nature
	// Abstraction --> 100%
}

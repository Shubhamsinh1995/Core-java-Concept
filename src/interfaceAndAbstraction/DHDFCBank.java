package interfaceAndAbstraction;

public class DHDFCBank implements USBank,RBIBank {

	@Override
	public void homeloan() {
		System.out.println("This is RBIBank loan method ");
		
	}

	@Override
	public void educationloan() {
		System.out.println("This is RBIBank education loan");
		
	}

	@Override
	public void credit() {
		System.out.println(" This is USBank credit method  ");
		
	}

	@Override
	public void debit() {
		System.out.println("this is USBank debit method");
		
	}

	@Override
	public void transfer() {
		System.out.println("this is USBank transfer method");
		
	}
	
	public void fund() {
		System.out.println("this is HDFCBank fund method");
	}
	
	public void deposit() {
		System.out.println("this is HDFCBank deposit method");
	}

}

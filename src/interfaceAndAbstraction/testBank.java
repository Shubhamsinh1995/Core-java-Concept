package interfaceAndAbstraction;

public class testBank {

	public static void main(String[] args) {
		
		DHDFCBank  obj= new DHDFCBank();
		
		System.out.println(USBank.minbal);
		obj.credit();
		obj.debit();
		obj.transfer();
		obj.educationloan();
		obj.homeloan();
		obj.fund();
		obj.deposit();
		System.out.println();
		
		USBank us=new DHDFCBank();
		us.credit();
		us.debit();
		us.transfer();
	}

}

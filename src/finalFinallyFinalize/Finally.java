package finalFinallyFinalize;

public class Finally {

	public static void main(String[] args) {
		
        test();
	}
	
	// finally is a block which present after try-catch block 
	// finally block always execute no matter which exception method will throw
	
	public static void test() {
		int div=0;
		try {
			System.out.println("we are in the test method");
			div=5/0;
		} catch (NumberFormatException e) {
			System.out.println("We are in the catch block");
			
		}
		finally {
			System.out.println("We are clossing the program");
		}
	}

}

package finalFinallyFinalize;

public class TestFinalClass extends FinalClass {
      // We can not extends final class
	  // We can not override final method
	
	
//	public  void finalmethod() {
//		System.out.println(" final method");
//	}
	
	public static void main(String[] args) {
	
		TestFinalClass fl=new TestFinalClass();
          fl.finalmethod();
          fl.show();
	}

}

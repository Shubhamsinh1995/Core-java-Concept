package finalFinallyFinalize;

public class Finallize {
	
	// finalize method is only used to clean up process
	// it is invoked before garbage collector
	public void finalize(){
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		Finallize  f1=new Finallize();
		Finallize f2=new Finallize();
		
		f1=null;
		f2=null;
		System.gc();
	}

}

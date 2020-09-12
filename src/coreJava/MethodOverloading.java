package coreJava;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading ob=new MethodOverloading();
		ob.show();
		ob.show(40);
		ob.show(30, 40);
		ob.show(12.40);
	}
	
	// We can overload the Main method but We can not Override main method
	public static void main(int a) {
		
	}
	
    public static void main(int a, int b) {
		
	}
    
    // You can not create a method inside the method
    // duplicate methods i.e. same method name with same number of argument are not allowed
	
	// Method Overloading --> When the method name is same with different arguments or input parameter within the same class
	public void show() {
		System.out.println("this is the show method");
	}
	
	public void show( int i) {
		System.out.println("this is the show method with 1 parameter");
		System.out.println(i);
	}
	
	public void show( double i) {
		System.out.println("this is the show method with 1 different para");
		System.out.println(i);
	}

	public void show( int i,int j) {
		System.out.println("this is the show method with 2 parameter");
		System.out.println(i+j);
	}
}

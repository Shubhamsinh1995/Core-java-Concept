package coreJava;

public class ParameterPassing {

	public static void main(String[] args) {
		ParameterPassing obj= new ParameterPassing();
		obj.add(30, 40);
        obj.sub(127.40, 120.00);
	}
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Sum is: "+c);
	}
	
	public void sub(double x, double y) {
	   double result=x-y;
	   System.out.println( "subtraction is: "+result);
	}

}

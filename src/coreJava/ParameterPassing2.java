package coreJava;

public class ParameterPassing2 {

	public static void main(String[] args) {
		
		DynamucCalculator obj1= new DynamucCalculator();
		
		int sum=obj1.add(30, 40);
		System.out.println("Sum is: "+sum);
		
		System.out.println();
		
        double res=obj1.sub(127.40, 120.00);
        System.out.println("Substraction is: "+res);
        
        System.out.println();
        
       int division= DynamucCalculator.div(20, 5); // static methods are called using class name, no need to use object of a class
       System.out.println("Division is: "+division);
        
	}
	
	

}

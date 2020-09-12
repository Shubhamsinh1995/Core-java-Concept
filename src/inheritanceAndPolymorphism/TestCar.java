package inheritanceAndPolymorphism;

public class TestCar {

	public static void main(String[] args) {
		
	// static polymorphism --or-- compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refule();
		b.theftSafty();
		b.engine();
		
		System.out.println();
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refule();
		c.engine();
		
		System.out.println();
		
		Car c1=new BMW(); // Child class object can be referred by Parent class reference variable -- Dynamic polymorphism -- Runtime polymorphism
		c1.start();       // this is the overridden method  
		c1.stop();
		c1.refule();
		c1.engine();
	}

}

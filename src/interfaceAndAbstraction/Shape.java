package interfaceAndAbstraction;

public abstract class Shape {
	
	Shape(){
		System.out.println("This is shape class constructor");
	}
	int a=200;
	public abstract void size();
	
	public void fill() {
		System.out.println("Shape .. fill method");
	}
	
	// in abstract class we have abstract and non abstract methods
	// 0-100% abstraction

}

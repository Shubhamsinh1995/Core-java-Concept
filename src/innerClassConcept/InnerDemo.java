package innerClassConcept;

class Outer{
	
	 static int a;
	public static void show()
	{
		System.out.println(" outer class ... show()");
	}
	
	static public class Inner
	{
		
		public void display() 
		{
			System.out.println(" In Display()");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj=new Outer();
		obj.show();
		
		//Outer.Inner obj1= obj.new Inner();   // for calling inner class method 
		//obj1.display();
		
		// fot static class
		Outer.Inner obj2=new Outer.Inner();
		obj2.display();

	}

}

package interfaceAndAbstraction;

public class Test extends Shape {
	Test(){
		System.out.println("This is Test class constructor");
	}

	public static void main(String[] args) {
		Test t=new Test();
//		Test t=new Test();
	t.fill();
	t.size();
	}

	@Override
	public void size() {
	System.out.println("Test .. size method ");
		
	}

}

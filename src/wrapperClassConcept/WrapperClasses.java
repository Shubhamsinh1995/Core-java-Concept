package wrapperClassConcept;

public class WrapperClasses {

	public static void main(String[] args) {
		
	// String to integer conversion
		String s="200";
		int a=Integer.parseInt(s);
		System.out.println(a);
		
	// String to double conversion
		String st="12.65";
		double d=Double.parseDouble(st);
		System.out.println(d);
		
	// String to boolean conversion
		String s2="false";
		boolean bl=Boolean.parseBoolean(s2);
		System.out.println(bl);
		
	// Integer to String conversion
		int p=29;
		String str=String.valueOf(p);
		System.out.println(str);
		
	// Boolean to String conversion
		boolean b=true;
		String str2=String.valueOf(b);
		System.out.println(str2);

	}

}

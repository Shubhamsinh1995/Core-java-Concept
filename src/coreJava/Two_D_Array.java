package coreJava;

public class Two_D_Array {

	public static void main(String[] args) {
		
		int d[][]= {
				     {2,3,4,5},
				     {4,5,6,8},
				     {8,9,4,3}
				    
		           };

		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("*****************************************");
		
		System.out.println("** jagged Array **");
	    int d1[][]= {
			          {2,3,4,5},
			          {4,5,6},
			          {8,9,4,3,1}
			    
	                };

	for(int i=0;i<d1.length;i++) {
	   for(int j=0;j<d1[i].length;j++) {
		System.out.print(" "+d1[i][j]);
	   }
	System.out.println();
   }
	
 }

}

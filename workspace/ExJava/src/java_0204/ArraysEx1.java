package java_0204;

import java.util.Arrays;

class ArraysEx1 {

	public static void main(String[] args) {
		
		String [] ar = {"fill()", "in", "the","Arrays"};
		System.out.println();
		Arrays.fill(ar, "Sun");

		for(String n : ar){
			System.out.print(n+", ");
		}
		System.out.println("\n-------------------------------------");
		
		Arrays.fill(ar, 1,3,"��");
		
		for(String n : ar){
			System.out.print(n+", ");
		}
	}

}

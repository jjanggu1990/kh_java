package java_0203;

import java.util.HashSet;

class HashSetEx1 {

	public static void main(String[] args) {
		String [] str = {"JAVA", "Beans","JAVA","XML"};
		
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		for(String n : str){
			
			if(!hs1.add(n)){
				hs2.add(n);
			}
		}
		System.out.println("hs1 : " + hs1);
		System.out.println("hs2 : " + hs2);
		hs1.removeAll(hs2);
		System.out.println("hs1 : " + hs1);
		System.out.println("hs2 : " + hs2);
	}

}

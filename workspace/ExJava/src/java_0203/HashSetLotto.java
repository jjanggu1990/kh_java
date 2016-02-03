package java_0203;

import java.util.HashSet;
import java.util.Set;

class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; set.size()<6;i++){
			int num = (int)(Math.random() * 45) +1;
			set.add(new Integer(num));
		}
		System.out.println(set);
		String str [] = set.toString().substring(1, set.toString().length()-1).split(",");
		System.out.println(str[0] + "\t" + str[1] +"\t"+ str[2] +"\t"+ str[3] +"\t"+ str[4] +"\t"+ str[5] +"\t");
	}

}

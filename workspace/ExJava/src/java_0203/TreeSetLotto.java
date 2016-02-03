package java_0203;

import java.util.TreeSet;
import java.util.Set;

class TreeSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i = 0 ; set.size()<6;i++){
			int num = (int)(Math.random() * 45) +1;
			set.add(new Integer(num));
		}
		System.out.println(set);
		String str [] = set.toString().substring(1, set.toString().length()-1).split(",");
		String tmp = "";
		for(int i = 0; i<str.length; i++){
			tmp += (str[i]+" ");
		}
		System.out.println(tmp);
	}

}

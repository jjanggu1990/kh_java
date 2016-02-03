package java_0203;

import java.util.HashSet;
import java.util.Set;

class HashSetEx2 {

	public static void main(String[] args) {
		Object [] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		
		Set<Object> set = new HashSet<Object>();
		
		for(int i = 0; i<objArr.length; i++){
			set.add(objArr[i]);
		}
		System.out.println(set);
	}

}

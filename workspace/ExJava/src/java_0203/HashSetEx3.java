package java_0203;

import java.util.HashSet;

class HashSetEx3 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		set.add("abc");
		set.add("abc");
		set.add(new String ("abc"));
		set.add(new String ("abc"));
		
		set.add(new Person1("David",10));
		set.add(new Person1("David",10));
		System.out.println(set);
	}

}

class Person1{
	String name;
	int age;
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name  + ":"+age;
	}
}
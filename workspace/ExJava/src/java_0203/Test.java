package java_0203;

import java.util.Vector;

class A{}
class B extends A{}

class Test {

	public static void main(String[] args) {
		Vector<A> v = new Vector<A>();
		v.add(new B());

	}

}

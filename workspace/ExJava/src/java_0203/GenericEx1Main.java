package java_0203;

class GenericEx1<T> {

	T[] v;

	public void set(T[] n) {
		v = n;
	}
	public void print() {
		for (T s : v)
			System.out.println(s);
	}
}

class GenericEx1Main {

	public static void main(String[] args) {
		GenericEx1 <String> t = new GenericEx1<String>();
		
		String [] ss = {"가","나","다"};
		t.set(ss);
		t.print();
/*
 * 아래의 방법은 권장하는 방법이 아니다.
 */
		GenericEx1 t1 = new GenericEx1();
		Integer[] s = {1,2,3};
		t1.set(s);
		t1.print();

	}
}

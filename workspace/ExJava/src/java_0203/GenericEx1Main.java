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
		
		String [] ss = {"��","��","��"};
		t.set(ss);
		t.print();
/*
 * �Ʒ��� ����� �����ϴ� ����� �ƴϴ�.
 */
		GenericEx1 t1 = new GenericEx1();
		Integer[] s = {1,2,3};
		t1.set(s);
		t1.print();

	}
}
package java_0204;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

class AbleEx1 {
	public static void main(String[] args) {
		Vector<Able> v = new Vector<Able>(2, 5);

		// AbleObject 생성 및 Vector에 추가
		Able a1 = new Able("B123", 90, 75, 70);
		Able a2 = new Able("T723", 60, 90, 80);
		Able a3 = new Able("A427", 85, 80, 80);
		Able a4 = new Able("G533", 90, 90, 60);
		Able a5 = new Able("G430", 90, 90, 60);
		v.addElement(a1);
		v.addElement(a2);
		v.addElement(a3);
		v.addElement(a4);
		v.addElement(a5);
		System.out.println("------ Sort 전 ------");
		
		for (Able n : v){
			System.out.println(n.empno + "," + n.getTotal());
		}
		
		Able[] a = new Able[v.size()];
		v.copyInto(a);
		AbleComp comp = new AbleComp();
		Arrays.sort(a, comp);
		System.out.println("------ Sort 후 ------");
		// v = new Vector<Able>(Arrays.asList(a));
		
		for (Able n : a){
			System.out.println(n.empno + "," + n.getTotal());
		}
	}
}

class Able {
	String empno;
	int net, ejb, xml, total;

	public Able(int total) { // Constructor
		this.total = total;
	}

	public Able(String no, int n, int e, int x) { // Constructor
		empno = no;
		net = n;
		ejb = e;
		xml = x;
		total = n + e + x;
	}

	public int getTotal() {
		return total;
	}
	public String getEmpno(){
		return empno;
	}
}

/*
 * total 정수로 비교하기
 */

//class AbleComp implements Comparator<Able> {
//
//	public int compare(Able obj1, Able obj2) {
//		int var = 0;
//
//		if (obj1.getTotal() > obj2.getTotal()){
//			var = 1;
//		}else if (obj1.getTotal() < obj2.getTotal()){
//			var = -1;
//		}
//		return var;
//	}
//}

/*
 * 사원번호로 정렬하기.
 */

class AbleComp implements Comparator<Able> {

	public int compare(Able obj1, Able obj2) {
		return obj1.getEmpno().compareTo(obj2.getEmpno());
	}
}
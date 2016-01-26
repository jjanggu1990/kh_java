package java_0126;


class Test {

	public static void main(String[] args) {
		Animal a = new Dog();
		Dog g = (Dog)a;
		System.out.println(g.b);
		System.out.println(g.wal());
		System.out.println(a.kunk());
		Animal c = g;
		System.out.println(g instanceof Animal);
	}

}
class Animal {
	int a =0;
	public int kunk(){
		return 1;
	}
}

class Dog extends Animal{
	int b =0;
	public int wal(){
		return 2;
		
	}
}
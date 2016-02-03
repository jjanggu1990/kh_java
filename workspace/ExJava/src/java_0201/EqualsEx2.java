package java_0201;

class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(651656234512345L);
		Person p2 = new Person(651656234512345L);
		
		if(p1 == p2){
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else{
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		if(p1.equals(p2)){
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else{
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
	}

}


class Person{
	long id ;
	Person(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj){
		if(obj != null && obj instanceof Person){
			return id == ((Person)obj).id;
		}
		return false;
	}
}
package java_0201;

class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(651656234512345L);
		Person p2 = new Person(651656234512345L);
		
		if(p1 == p2){
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else{
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		if(p1.equals(p2)){
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else{
			System.out.println("p1과 p2는 다른 사람입니다.");
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
package java_0127;

class InterfaceTest3 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA(); // 제3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
		
	}
}

class A2 {
	void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
	}
}

interface I2 {
	public abstract void methodB();
}

class B2 implements I2 {
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class InstanceManager {
	
	//return type 을 super로 선언 -> sub 객체 리턴 가능
	public static I2 getInstance() {
		return new B2();
	}
}
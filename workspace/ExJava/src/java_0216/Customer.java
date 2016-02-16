package java_0216;

import java.io.Serializable;

public class Customer implements Serializable{

	private transient String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "당신의 이름:" + name;
	}

}

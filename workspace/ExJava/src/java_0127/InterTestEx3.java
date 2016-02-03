package java_0127;

import java.util.Scanner;

interface Say {
	public void Hello();
}

class Korean implements Say {
	@Override
	public void Hello() {
		System.out.println("�ȳ�");
	}
}

class English implements Say {
	@Override
	public void Hello() {
		System.out.println("Hello");
	}
}

class Etc implements Say {
	@Override
	public void Hello() {
		System.out.println("Hi~~");
	}
}

class InterTestEx3 {
	public static void main(String[] args){
		Korean k = new Korean();
		English e = new English();
		Etc et = new Etc();
		Say s;
		//String lang = args[0];
		String lang = new Scanner(System.in).nextLine();
		if (lang.equals("e")) {
			s = e;
		} else if (lang.equals("k")) {
			s = k;
		} else {
			s = et;
		}

		s.Hello();
	}
}
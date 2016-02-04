package java_0204;

import java.util.Random;

class RandomEx1 {

	public static void main(String[] args) {
		String[] lesson = { "JAVA Beg", "JSP", "XML&JAVA", "EJB" };

		Random r1 = new Random(System.currentTimeMillis());
		int index = r1.nextInt(4);
		System.out.println("선택과목 : " + lesson[index]);
	}

}

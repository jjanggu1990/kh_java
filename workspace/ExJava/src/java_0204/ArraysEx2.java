package java_0204;

import java.util.Arrays;

class ArraysEx2 {

	public static void main(String[] args) {

		String[] ar1 = { "fill()", "in", "the", "Arrays" };
		String[] ar2 = { "fill()", "in", "", "Arrays" };

		if (!Arrays.equals(ar1, ar2)) {
			System.out.println("두 Array는 다릅니다.");
		}
		
		Arrays.fill(ar2, 2, 3, "the");
		
		if (!Arrays.equals(ar1, ar2)) {
			System.out.println("두 Array이 다릅니다.");
		} else {
			System.out.println("두 Array이 같습니다.");
		}
	}
}

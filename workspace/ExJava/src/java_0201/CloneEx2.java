package java_0201;
import java.util.*;

class CloneEx2 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};

		int[] arrClone = (int[])arr.clone(); // �迭 arr�� �����ؼ� ���� ������ ���ο� �迭�� �����.
		arrClone[0]= 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}
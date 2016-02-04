package java_0204;
import java.util.*;


/*
 * 
 * roll 메소드는 해당 값만 변하고
 * add 메소드는 해당 값이 변함에 따라 월, 년 등의 값 또한 변한다.
 * 
 * 
 */


class  CalendarEx4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();

		date.set(2014, 7, 31);	// 2014년 8월 31일
		
		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date)); //9/1

		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date)); //3/1

		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);			//roll은 해당 값만 변함
		System.out.println(toString(date)); // 


		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);			
		System.out.println(toString(date)); // 4/1
		
		
/*
 * 이 경우는 2월이  31일이 존재하지 않으므로, 29일로 변경된다.
 */
		date.set(2016, 0, 31);
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}














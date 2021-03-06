package java_0129;

class ExceptionEx2 {
	public static void main(String[] args) {
		try{
			int data = Integer.parseInt(args[0]);
			System.out.println(50/data);
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아닙니다. 숫자를 입력하시오.");
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("매개변수가 없다.");
		}catch(ArithmeticException ae){
			System.out.println("0으로 나누지 마세요.");
		}catch (Exception e){
			System.out.println("그 외의 에러 입니다.");
		}finally{
			System.out.println("무조건 실행");
		}
		//가장 큰 범위의 Exception 이 마지막에 위치해야 한다.
		//finally는 return 문조차도 막지 못함. 무조건 실행
		try{
			
		}finally{
			
		}
	}
}
package java_0120;

class _003ArrayEx {

	public static void main(String[] args) {
		/*
		 * 
		 * 변수 : 하나의 값을 저장 하는 공간
		 * 배열 : 같은 타입의 여러개의 값을 모아서 저장하는 공간
		 * 
		 * 
		 */
		
		//기본적인 배열 생성 방법
		System.out.println("배열 예제");
		char [] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		for (int i = 0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		
//		String str = new String(ch);
//		System.out.println(str);
		
		
		//저장될 값을 미리 알고 있을 때, 생성과 동시에 값을 저장 하는 방법
		int [] i1 = {1,2,3,4};
		int [] i2 = new int [] {1,2,3,4};

		/*
		 * for-each 문
		 * for(변수 선언 : 집합데이터(배열/ 컬렉션) {수행문}
		 * 
		 */
		System.out.println("\n\nfor-each 문");
		for (int num : i1){
			System.out.println(num);
		}
		
		/*
		 * 객체 타입 배열
		 * 
		 * 
		 */
		System.out.println("\n\n객체타입 배열 예제");
		String [] str_arr = new String [3];
		str_arr[0] = "Java";
		str_arr[1] = "Array";
		str_arr[2] = "Test";
		for(int i = 0;i<str_arr.length;i++){
			System.out.println(str_arr[i]);
		}
		
		/*
		 * String 배열 선언 여러가지 방법들
		 * String [] arr = {"j","a"};
		 * String [] arr1 = new String [] {"j","a","v","a");
		 * String [] arr2 = new String [] {new String("jj"),new String ("aa")};
		 * 
		 */
		
		/*
		 * 
		 * 메인 메소드의 인수가 없을 때
		 * 
		 */
		System.out.println("\n\n메인메소드의 인수가 없을 때");
		String [] arr_args;
		if(args.length > 0){
			arr_args = args;
			for(int i =0;i<args.length;i++){
				System.out.println("arr["+i+"]: "+ arr_args[i]);
			}
			
		}else{
			System.out.println("args 의 내용이 없습니다.");
		}
		
		/*
		 * 
		 * 다차원 배열
		 * 
		 */
		System.out.println("\n\n다차원 배열");
		int [][] test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		//-------------------------
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		
		for(int i = 0 ;i<test.length; i++){
			for(int j = 0;j<test[i].length;j++){
				System.out.println("test["+i+"]["+j+"]="+test[i][j]);
			}
		}
		/*
		 * 다차원배열은 여러개의 배열을 갖고 있고,
		 * 그 안에 또 여러개의 값을 갖고 있는 형태이므로
		 * 처음에 배열에서 1차원 배열을 꺼내오고
		 * 그리고 1차원배열에서 각각 int 값을 꺼내오는 형태이다.
		 */
		System.out.println("\n\n다차원 배열을 for-each 문을 사용하여 출력");
		for (int [] tmp : test){
			for(int i : tmp){
				System.out.println(i);
			}
		}
		
		/*
		 * 가변배열
		 */
		System.out.println("\n\n가변배열");
		
		int [] t1 = {1, 100};
		int [] t2 = {20, 200, 2000, 20000};
		
		int[][] t3 = new int [2][];
		t3[0] = t1;
		t3[1] = t2;
		
		for(int i = 0; i< t3.length; i++){
			for(int j = 0; j<t3[i].length;j++){
				System.out.println("test["+i+"]["+j+"]:"+t3[i][j]);
			}
			System.out.println("-------------------------------");
		}
		
		/*
		 * 배열 복사
		 * System.arraycopy(원배열, 시작위치(int), 복사할배열, 시작위치(int), 복사갯수(int))
		 * arraycopy 메소드 사용시 주의사항
		 * 인덱스를 주의해서 사용해야 함.
		 * 시작위치와 복사 갯수에 특별히 주의 요망
		 */
		System.out.println("\n\n배열 복사");
		byte ar1 [] = {11,22,33,44,55};
		byte ar2 [] = new byte[10];
		
		System.arraycopy(ar1, 0, ar2, 3, 5);
		//ar1배열의 0번부터 ar2배열의 3번자리에 5개의 데이터를 복사
		
		System.out.println("원본 배열");
		for(byte n : ar1)
			System.out.print(n+" ");
		System.out.println("\n복사한 배열");
		for(byte n : ar2)
			System.out.print(n+" ");
	}
}
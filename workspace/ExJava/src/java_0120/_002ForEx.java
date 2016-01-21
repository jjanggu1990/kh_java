package java_0120;

import java.util.concurrent.SynchronousQueue;

class _002ForEx {

	public static void main(String[] args) {
		
		/*
		 * 0부터 인수로 입력한 값까지의 합
		 * 
		 * args[0] : 15
		 */
		
		int i;
		int sum=0;
		int arg_num = Integer.parseInt(args[0]);
		
		for (i = 0; i<=arg_num; i++){
			sum+=i;
			System.out.print(sum+" ");
		}
		System.out.println("\n"+sum);
		
		
		
		System.out.println("\n\n 구구단 찍기");
		/*
		 * 구구단 찍기
		 * 
		 * args[1] : 2
		 * 인수로 받은 값을 단수로 이용
		 * 1부터 순서대로 출력후, 9부터 역순으로 출력
		 * 
		 * 
		 */
		
		int num_dan = Integer.parseInt(args[1]);
		/*
		int j =9;
		for(i =1;i<19;i++){
			if(i>=10){
				System.out.println(num_dan+" x "+j+" = "+(num_dan * j));
				j--;
				continue;
			}
			System.out.println(num_dan+" x "+i+" = "+(num_dan * i));
		}
		*/
		for(i=1;i<10;i++){
			System.out.println(num_dan+" x "+i+" = "+ (num_dan * i));
		}
		System.out.println();
		for(i=9;i>0;i--){
			System.out.println(num_dan+" x "+i+" = "+(num_dan * i));
		}
		
		
		/*
		 * 
		 * 다중 for 예제
		 * 아스키코드값 65 : 'A'
		 * 아스키코드값 97 : 'a'
		 * \t : tab 키
		 */
		System.out.println("\n\n 다중 for 예제");
		char ch = 65;
		for (i =0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(ch++ +"\t");
			}
			System.out.println();
		}
		System.out.println(ch);
		
		
		
		/*
		 * for 문을 이용해서 짝수만 출력하기
		 * args[2] : 11
		 * 인수로 입력 받은 숫자까지
		 * 
		 */
		int n = Integer.parseInt(args[2]);
		for (i =0 ; i<=n;i++){
			if((i%2)==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		for(i=0; i<=n; i+=2){
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(i=0; i<=(n/2);i++){
			System.out.print(i*2+" ");
		}
		
		/*
		 * while 문 예제
		 * args[3] : 
		 */
		
		System.out.println("\n\nwhile 문 예제");
		sum = i = 0;
		int j = Integer.parseInt(args[3]);
		while(i<=j){
			sum += i;
			i++;
		}
		System.out.println("1~"+ j + "까지의 합 : " + sum);
		
		
		/*
		 * do while 문 예제
		 * while 문 후미에 ; 잊지 않고 찍기
		 * 
		 */
		System.out.println("\n\ndo while 문 예제");
		i = 5;
		String str = "Java DoublePlus";
		do{
			System.out.println(str);
		}while(i-- > 10);
		
		
		/*
		 * 
		 * break 예제
		 * label : 반복문에 이름을 붙이는 것
		 * 
		 */
		System.out.println("\n\nbreak 예제");
		label: 
			for(i = 0;i<3;i++){
				for(j = 0; j<5;j++){
					if (j==3)
						break label;
					System.out.println("i값 : " + i + "  j값 : "+j);
				}
			}
		
		
		/*
		 * continue 예제
		 * continue 와 break 문 이하의 문장은 처리 안함
		 */
		System.out.println("\n\ncontinue 문 예제");
		for(i = 0;i<10;i++){
			if (i%4 != 0)
				continue;
			System.out.println("i값 : " + i);
		}
		System.out.println("\n\nlebel이 붙은 continue");
		label: 
			for(i = 0;i<5;i++){
				for(j = 0; j<5;j++){
					if (j==3)
						continue label;
					System.out.println("i값 : " + i + "  j값 : "+j);
				}
			}
		
		
		
		
	}
}
package java_0121;

class FactorialTest {

	public static void main(String[] args) {
		System.out.println(factorial(4));

	}
	static long factorial(int n){
		long result = 0;
		if(n==1){
			result = 1;
			System.out.println("factorial -> if "+result);

		}else{
			System.out.println("factorial -> else " +result);
			result = n * factorial(n-1);
		}
		System.out.println("return �� : "+result);
		return result;
	}

}

package java_0201;

class Test {

	public static void main(String[] args) {
//		String a = new String ("abcas");
//		String b = new String ("abcas");
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		String c = "abcbc";
//		String d = "abcbc";
//		System.out.println(c.hashCode());
//		System.out.println(d.hashCode());
//		
//		
//		String a1 = null;
//		System.out.println(a1);
//		System.out.println(a1+1);
//
		long [] arr = new long [10];
		for(int j = 0;j<10;j++){
			long a = System.currentTimeMillis();
			for(int i = 0 ; i<10000000;i++){

//				String str = Integer.toString(i);
				String str = String.valueOf(i);
			}
			long b = System.currentTimeMillis();
			arr[j] = b-a;
		}
		int sum =0;
		for(int i =0;i<10;i++){
			sum += arr[i];
		}
		System.out.println(sum/10);
//		String.valueOf(1);
//		Integer.toString(1);
		
		
	}

}

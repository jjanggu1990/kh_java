package java_0122;


class _007InitTest {
	
	int iv = 1;

	static int cv = 1;
	
	static{ cv = 2;
	System.out.println("cv : "+cv);
	}
	
	
	{ iv = 2; 
	System.out.println("iv : " + iv);
	}
	
	_007InitTest(){
		iv = 3;
		System.out.println("������: iv : "+iv);
	}

	public static void main(String[] args) {
		_007InitTest it = new _007InitTest();
		System.out.println("it.iv : " + it.iv);
		System.out.println("it.cv : " + it.cv);
	}

}

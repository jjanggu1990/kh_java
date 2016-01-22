package java_0122;

class _006BlockTest {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	_006BlockTest(){
		System.out.println("»ý¼ºÀÚ");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		_006BlockTest bt = new _006BlockTest();
		
		
		System.out.println("BlockTest bt1 = new BlockTest(); ");
		_006BlockTest bt1 = new _006BlockTest();

	}

}



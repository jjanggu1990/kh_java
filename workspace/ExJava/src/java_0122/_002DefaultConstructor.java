package java_0122;

class _002DefaultConstructor {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		
		//�������� �Ű������� �ٸ� ���, ���� �߻�
		Data2 d2 = new Data2(3);

	}

}

class Data1{
	int valut;
	
}
class Data2{
	int value;
	Data2(int x){
		value = x;
	}
}
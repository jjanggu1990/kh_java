package java_0201;

class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = original.clone();// ��ü�� �����ؼ� ���ο� ��ü�� �����.
		System.out.println(original);
		System.out.println(copy);
		copy.x= 10;
		System.out.println(original);
		System.out.println(copy);
	}

}
//Cloneable�������̽��� ������ Ŭ���������� clone()�� ȣ���� �� �ִ�. 
//�� �������̽��� �������� �ʰ� clone()�� ȣ���ϸ� ���ܰ� �߻��Ѵ�.
class Point implements Cloneable{
	int x ,y;
	Point (int x, int y ){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return "x ="+x+", y ="+y;
	}
	@Override
	public Point clone(){
		Object obj = null;
		// clone�޼��忡�� CloneNotSupportedException�� 
		//����Ǿ� �����Ƿ� �� �޼��带 ȣ���� ���� try-catch���� ����ؾ��Ѵ�.
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException e){}
		return (Point)obj;
	}
}
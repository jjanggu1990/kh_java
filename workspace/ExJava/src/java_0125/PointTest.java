package java_0125;

class PointTest extends Object{

	public static void main(String[] args) {
		System.out.println(new Point3D(1,2,3).getLocation());

	}

}

class Point{
	int x ;
	int y ;
	
	Point (int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	String getLocation(){
		return "x :" + x + ", y : " +y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);
//		this.x = x;
//		this.y = y;
		this.z = z;
		
	}
	//annotation 오버라이드 된 멤버에만 붙일 수 있음
	@Override
	String getLocation(){
		return "x : " + x +", y : "+y + ", z : " +z;
	}
}
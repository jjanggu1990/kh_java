package java_0129;

class Taxi extends Car {
	int charge;
	boolean fare; //true 이면 할증
	String company;
	
	Taxi(String company){this.company = company;}
	
	public void account(){
		if(fare){
			charge = speed * 12;
		}
		else {
			charge = speed * 10;
		}
	}
	
	public void setFare(){
		fare = !fare;
	}
	
	public String toString(){
		return "택시회사 : "+company + " 요금 : "+ charge+" 할증여부 : "+ ((fare)?" 할증 중":" 할증 아님");
		
	}
}

package java_0129;

class Taxi extends Car {
	int charge;
	boolean fare; //true �̸� ����
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
		return "�ý�ȸ�� : "+company + " ��� : "+ charge+" �������� : "+ ((fare)?" ���� ��":" ���� �ƴ�");
		
	}
}
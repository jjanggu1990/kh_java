package java_0205;

class SingleThreadEx extends Thread {

	private int[] temp;

	public SingleThreadEx(String threadname) {
		super(threadname);
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}

	public void run() {
		for (int start : temp) {
			try {
				sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("������ �߰� " + getState());
			System.out.printf("������ �̸�  : %s ,", currentThread().getName());
			System.out.printf("temp value  : %d %n", start);
		}
	}

	public static void main(String[] args) {
		SingleThreadEx st = new SingleThreadEx("ù��°");
		System.out.println("������ ����"+st.getState());
		
/*
 * �ٷ� run �޼ҵ带 �����ϸ�, jvm �� ���ξ����带 ������ ���α׷��� ������.
 * �׷��Ƿ�, ������� main �̶�� �̸����� �����尡 �����ϸ�, run �޼ҵ带 ������� ����ȴ�.
 * st.getState() �޼ҵ带 ������ ����, st ������(ù��°)�� new �� ���·� �����Ѵ�.
 * st.start�� �����ϸ�, "ù��°"��� �̸����� �����带 ����� Runnable ���·� �����ϰ�,
 * �����尡 ���������� �۵��Ѵ�.
 * 
 * ���������� ���θ޼ҵ嵵 ������� �����ϹǷ�, st.start �� st.run �̳� �����ϴ� �����
 * �ٸ��� �ʴ�.
 * 
 * �������� dead�� ���� �ʹٸ�, join���� main �����尡 ��ٸ����� �ϸ� �� �� �ִ�.
 * 
 */
		//st.run();
		st.start();
		try {
			st.join();
		} catch (InterruptedException e) {
		}
		System.out.println("������ ��"+st.getState());
	}
}
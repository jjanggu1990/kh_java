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
			System.out.println("쓰레드 중간 " + getState());
			System.out.printf("스레드 이름  : %s ,", currentThread().getName());
			System.out.printf("temp value  : %d %n", start);
		}
	}

	public static void main(String[] args) {
		SingleThreadEx st = new SingleThreadEx("첫번째");
		System.out.println("쓰레드 시작" + st.getState());

		/*
		 * 바로 run 메소드를 실행하면, jvm 이 메인쓰레드를 생성해 프로그램을 실행함. 그러므로, 쓰레드는 main 이라는
		 * 이름으로 쓰레드가 실행하며, run 메소드를 차래대로 실행된다. st.getState() 메소드를 실행해 보면, st
		 * 쓰레드(첫번째)는 new 인 상태로 존재한다. st.start로 실행하면, "첫번째"라는 이름으로 쓰레드를 만들고
		 * Runnable 상태로 변경하고, 쓰레드가 정상적으로 작동한다.
		 * 
		 * 주의할점은 메인메소드도 쓰레드로 동작하므로, st.start 나 st.run 이나 동작하는 방법은 다르지 않다.
		 * 
		 * 쓰레드의 dead를 보고 싶다면, join으로 main 쓰레드가 기다리도록 하면 볼 수 있다.
		 * 
		 */
		// st.run();
		st.start();
		try {
			st.join();
		} catch (InterruptedException e) {
		}
		System.out.println("쓰레드 끝" + st.getState());
	}
}
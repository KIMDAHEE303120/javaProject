package threads;

import java.awt.Toolkit;

class WorkerThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

//인터페이스
class NewThread implements Runnable {

	@Override
	public void run() {
// 	p.582	
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}

public class BeepPrintExample {
	public static void main(String[] args) {
		// 1) Thread 상속받아서 새로운 WorkerThread 클래스 생성
//		Thread thread = new WorkerThread();
//		thread.start();

		// 2) Runnable I/F를 구현하는 클래스를 Thread(new Runnable())의 생성자 매개값으로 사용하여 새로운 thread
		// 생성
		Thread thread = new Thread();
		thread.start();

		//*** 3) Runnable I/F를 구현하는 익명클래스 생성*** 알아두기 p.583
		thread = new Thread(new Runnable() {
			@Override
			public void run() { // 추상메소드 정의
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

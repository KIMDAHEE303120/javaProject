package api;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for (int i=0; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null; //Counter 객체를 쓰레기로 만듬

			System.gc(); //쓰레기 수집기 실행 요청
			
			//무작위로 쓰레기 수집기를 실행, 전부소멸X>메모리의 상태를 보고 일부만 소멸시킴
		}
	}

}

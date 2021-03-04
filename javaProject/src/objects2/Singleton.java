package objects2;

public class Singleton { //외부에서 호출 못하도록 클래스 만들기
	
	//필드>인스턴스를 만들어서 할당(private으로 외부에서 호출 못하도록 함)
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() { }
	
	//메소드
	public static Singleton getInstance() {
		return singleton;
	}
	
}

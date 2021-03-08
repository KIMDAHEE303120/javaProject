package interfaces;

public interface RemoteControl {
	static final int MAX_VOLUME = 10; // 상수:값 지정되면 바꿀수 없음, interface에서는 static final을 따로 안적어도 욈
	static final int MIN_VOLUME = 0;
	// int MID_VALUE; 같은 필드를 설정할 수 없음
	
	
	//메소드
	void turnOn(); //{}중괄호 못씀=구현부분을 쓸 수 없음 .. 추상메소드만 선언 가능
	void turnOff();
	void setVolume(int volume);
	
}

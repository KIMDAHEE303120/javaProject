package nestedClasses;

public class Button {
	// 인터페이스 타입 (속성)
	OnClickListener listener;

	//매개변수의 다형성 
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	//구현객체의 onClick() 메소드 호출
	void touch() {
		listener.onClick();
	}

	
	//중첩 인터페이스
	interface OnClickListener {
		void onClick();
		
	

	}

}

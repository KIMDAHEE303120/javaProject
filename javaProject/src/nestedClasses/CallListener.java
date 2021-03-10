package nestedClasses;

//구현 객체

public class CallListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}

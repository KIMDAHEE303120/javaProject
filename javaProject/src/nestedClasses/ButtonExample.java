package nestedClasses;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener()); // onClickListener의 구현객체가 올 자리 "public class CallListener implements
													// Button.OnClickListener"
		btn.touch(); // 어떤 구현객체가 왔는지에 따라
						// Button.onClick() 메소드가 실행됨

		btn.setOnClickListener(new MessageListener());
		btn.touch();

		// 굳이 클래스를 선언하지 말고 익명의 객체를 선언
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("영상을 보냅니다.");
			}
		});
		btn.touch(); // 익명의 구현객체를 실행
	}

}
